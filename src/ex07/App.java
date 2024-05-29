package ex07;

import ex07.lib.DB;
import ex07.lib.Driver;

public class App {
    public static void main(String[] args) {
        DBFactory factory = DBFactory.getInstance();
        DB oracleDB = factory.createDB(Driver.MARIA); // DB, MariaDB // "maria"이런 것들을 ENUM으로 만들면 문서를 안 읽어볼 수 있다.
        oracleDB.execute("select"); // 동적 바인딩
    }
}
