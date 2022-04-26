package kr.hs.study.beans;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import kr.hs.study.dao.TestDAO;

@Configuration
@ComponentScan(basePackages = {"kr.hs.study.beans", "kr.hs.study.dao"})
public class BeanConfigClass {
	//접속정보 : BasicDataSource를 사용
	@Bean
	   public BasicDataSource source() {
	      BasicDataSource source = new BasicDataSource();
	      source.setDriverClassName("oracle.jdbc.OracleDriver");
	      source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	      source.setUsername("SpringOracle");
	      source.setPassword("abc123");
	      return source;
	   }
	
	//데이터베이스에 접속해서 실제 쿼리는 전달하는 bean을 등록
	@Bean
	public JdbcTemplate db(BasicDataSource source) {
		JdbcTemplate db = new JdbcTemplate(source);
		return db;
	}
}