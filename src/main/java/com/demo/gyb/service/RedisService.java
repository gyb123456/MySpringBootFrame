package com.demo.gyb.service;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.concurrent.TimeUnit;

@Service(value = "redisService")
public class RedisService {

	@SuppressWarnings("rawtypes")
	@Autowired
	private RedisTemplate redisTemplate;

	@SuppressWarnings("unchecked")
	public void writeRedis(String key, String value, long timeout, TimeUnit unit) {
		ValueOperations<String, String> operations = redisTemplate.opsForValue();
		operations.set(key, value, timeout, unit);
	}
	@SuppressWarnings("unchecked")
	public String readRedis(String key) {
		ValueOperations<String, String> operations = redisTemplate.opsForValue();
		return operations.get(key);
	}
	
	/**
	 * 获取key的集合
	 * @param key 通配符key
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Set<String> getKeys(String key) {
		return redisTemplate.keys(key);
	}
	/**
	 * 通过key到redis中获取对应的值 是字符串类型的 和compareValue相比较 若一致返回true 不一致返回false
	 * 
	 * @param key
	 * @param compareValue
	 *            比较值
	 * @return boolean
	 */
	@SuppressWarnings("unchecked")
	public boolean readRedis(String key, String compareValue) {
		ValueOperations<String, String> operations = redisTemplate.opsForValue();
		String value = operations.get(key);
		if (StringUtils.isNotBlank(value)) {
			if ((value).equals(compareValue)) {
				return true;
			}
		} else {
			return false;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public void writeRedis(String key, String value) {
		ValueOperations<String, String> operations = redisTemplate.opsForValue();
		operations.set(key, value, 60, TimeUnit.DAYS);
	}

	@SuppressWarnings("unchecked")
	public void delKey(String tk) {
		redisTemplate.delete(tk);
	}
	@SuppressWarnings("unchecked")
	public boolean hasKey(String tk) {
		return redisTemplate.hasKey(tk);
	}

}
