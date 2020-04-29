package cn.cps.sqltoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = { "cn.cps" })
public class SqlToyApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(SqlToyApplication.class);
    }
}
