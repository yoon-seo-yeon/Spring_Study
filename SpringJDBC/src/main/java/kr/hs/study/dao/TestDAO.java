package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;
import kr.hs.study.mapper.MapperClass;

@Component
public class TestDAO {
	//실제 쿼리를 날리는 곳
	//쿼리 날리는 애 : dbcTemplate
	//여기에 jdbcTemplate이 있어야 한다.
	@Autowired
	JdbcTemplate db;
	
	@Autowired
	private MapperClass mapper;
	
	//insert
	public void insert_data(TestBean bean) {
		String sql = "insert into test values(?, ?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}
	
	//update
	public void update_data(TestBean bean) {
		String sql = "update test set data2 = ? where data1 = ?";
		db.update(sql, bean.getData2(), bean.getData1());
		
		//sql: update test set data=? where data1=?
		//data1이 100인 data2값을 testtest로 변경
	}
	
	//delete
	public void delete_data(TestBean bean) {
		String sql = "delete test where data1 = ?";
		db.update(sql, bean.getData1());
	}
	
	//select
	public List<TestBean> select_data() {
		String sql = "select * from test";
		List<TestBean> list = db.query(sql,  mapper);
		return list;
	}
}