package logger.impl.appenders;

import logger.enums.ReportLevel;
import logger.interfaces.Layout;

public class ConsoleAppender extends BaseAppender {

    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String time, String message, ReportLevel reportLevel) {
        String formattedMessage = this.layout.format(time, message, reportLevel);
        System.out.println(formattedMessage);
    }
}
