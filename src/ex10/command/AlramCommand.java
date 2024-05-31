package ex10.command;

import ex10.alram.Alarm;

public class AlramCommand implements Command{

    private Alarm alarm;

    public AlramCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.alramOn();
    }
}