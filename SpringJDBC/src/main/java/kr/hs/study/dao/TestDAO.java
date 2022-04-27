package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDAO {
	//���� ������ ������ ��
	//���� ������ �� : dbcTemplate
	//���⿡ jdbcTemplate�� �־�� �Ѵ�.
	@Autowired
	JdbcTemplate db;
	
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
		//data1�� 100�� data2���� testtest�� ����
	}
	
	//delete
	public void delete_data(TestBean bean) {
		String sql = "delete test where data1 = ?";
		db.update(sql, bean.getData1());
	}
}