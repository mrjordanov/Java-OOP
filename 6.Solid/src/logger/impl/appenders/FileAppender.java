package logger.impl.appenders;

import logger.enums.ReportLevel;
import logger.interfaces.File;
import logger.interfaces.Layout;


public class FileAppender extends BaseAppender {
    private File file;

    public FileAppender(Layout layout) {
        super(layout);
        this.file = new LogFile();
    }

    public FileAppender(Layout layout, String filename) {
        this(layout);
        this.file = new LogFile(filename);
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public void append(String time, String message, ReportLevel reportLevel) {
        if (this.canAppend(reportLevel)) {
            String output = this.layout.format(time, message, reportLevel);
            increaseMessageCount();
            file.append(output);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " File size : " + this.file.getSize();
    }
}
