package com.maxiaohua.genealogy.fw.core.memory.db.impl;


public class QueryKeyValueImpl extends MemoryDBSupport implements com.maxiaohua.genealogy.fw.core.memory.db.QueryKeyValue {
	@Override
	public String queryForString(String key) {
		return this.get(key);
	}
}