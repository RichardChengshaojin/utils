package log;//package third.log;
//
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//import org.apache.log4j.xml.DOMConfigurator;
//
//import java.net.URL;
//
///**
// * DEC
// *
// * @auther chengshaojin
// * @since 2016/12/3
// */
//public class Log4jOneTest {
//
//    private static final Logger logger;
//
//    static {
//        String customizedPath = "log/log4j.xml";
////        System.setProperty("log4j.configuration", customizedPath);
////        PropertyConfigurator.configure(getResource(customizedPath));
//        DOMConfigurator.configure(getResource(customizedPath));
////        BasicConfigurator.configure();
//        logger = LogManager.getLogger(Log4jOneTest.class);
//    }
//
//    public static URL getResource(String path) {
//        URL url;
//        url = Log4jOneTest.class.getClassLoader().getResource(path);
//        return url;
//    }
//
//    public static void printLog(Logger logger) {
//        logger.trace("trace");
//        logger.debug("debug");
//        logger.info("info");
//        logger.warn("warn");
//        logger.error("error");
//        logger.fatal("fatal");
//    }
//
//    public static void main(String[] args) {
//        printLog(logger);
//    }
//}
