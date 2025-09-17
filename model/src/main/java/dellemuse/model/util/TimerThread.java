/*
 * Odilon Object Storage
 * (c) kbee 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dellemuse.model.util;

import java.util.concurrent.atomic.AtomicBoolean;

import dellemuse.model.logging.Logger;


/**
 * <p>
 * Simple abstract class that can execute a cleanup process regularly
 * </p>
 * <p>
 * Subclasses must implement the method {@code cleanUp}
 * </p>
 * 
 * @author atolomei@novamens.com (Alejandro Tolomei)
 * 
 */
public abstract class TimerThread implements Runnable {

    static public Logger logger = Logger.getLogger(TimerThread.class.getName());

    

    private AtomicBoolean exit = new AtomicBoolean(false);
    private Thread thread;

    public TimerThread() {
    }

    public abstract void onTimer();
    

    public boolean exit() {
        return this.exit.get();
    }

    public void sendExitSignal() {
        this.exit.set(true);
        if (this.thread != null)
            this.thread.interrupt();
    }

    public long getSleepTimeMillis() {
        return Constant.DEFAULT_SLEEP_TIME;
    }
    

    @Override
    public void run() {
        Check.checkTrue(getSleepTimeMillis() > 100, "sleep time must be > 100 milisecs -> " + String.valueOf(getSleepTimeMillis()));
        this.thread = Thread.currentThread();
        synchronized (this) {
            while (!exit()) {
                try {
                    Thread.sleep(getSleepTimeMillis());
                    onTimer();
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
