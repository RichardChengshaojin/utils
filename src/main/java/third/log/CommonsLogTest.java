package third.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/3
 */
public class CommonsLogTest {

    private static final Log logger;
    static {
        // 初始化commons-logging
//        String where = "C:\\Users\\chengshaojin.XGD\\Desktop\\logtest\\log.log";
        String where = "STDOUT";
//        String where = "STDERR";
        System.setProperty("org.apache.commons.logging.diagnostics.dest", where);
//        System.setProperty("org.apache.commons.logging.LogFactory", "org.apache.commons.logging.impl.LogFactoryImpl");

        // 初始化log4j
        initLog4j();

        logger = LogFactory.getLog(CommonsLogTest.class);
    }

    private static void initLog4j() {
        String customizedPath = "log/log4j.xml";
        System.setProperty("log4j.configuration", customizedPath);
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("org.apache.commons.logging.diagnostics.dest"));
        UseLogger.printAllKindsLogInfo(logger);
    }
}
