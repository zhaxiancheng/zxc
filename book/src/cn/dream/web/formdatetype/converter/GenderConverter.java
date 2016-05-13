package cn.dream.web.formdatetype.converter;

import org.apache.commons.beanutils.Converter;

import cn.dream.bean.user.Gender;

public class GenderConverter implements Converter{

	@SuppressWarnings("unchecked")
	public Object convert(Class clazz, Object value) {
		if(value instanceof Gender) return value;
		try{
			return Gender.valueOf((String) value);
		}catch (Exception e) {}
		return null;
	}
}
