package weaversj.hpage.factory.impl;

import weaversj.hpage.bean.PageInfo;
import weaversj.hpage.factory.AbstractSqlEditor;

public class DB2SqlEditor extends AbstractSqlEditor {

	@Override
	public String createTable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countSql(String sql) {
		// TODO Auto-generated method stub
		return sql;
	}

	@Override
	public String addPagination(String sql, PageInfo pageInfo) {
		// TODO Auto-generated method stub
		return sql;
	}

	@Override
	public String ifTable(String table) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertTable(String sql, String pointid, String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String selectTableList(int top) {
		// TODO Auto-generated method stub
		return null;
	}

}
