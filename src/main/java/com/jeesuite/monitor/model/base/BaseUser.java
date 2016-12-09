package com.jeesuite.monitor.model.base;

import com.jfinal.plugin.activerecord.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}

	public java.lang.String getPassword() {
		return get("password");
	}

	public void setMobile(java.lang.String mobile) {
		set("mobile", mobile);
	}

	public java.lang.String getMobile() {
		return get("mobile");
	}

	public void setEmail(java.lang.String email) {
		set("email", email);
	}

	public java.lang.String getEmail() {
		return get("email");
	}

	public void setType(java.lang.Integer type) {
		set("type", type);
	}

	public java.lang.Integer getType() {
		return get("type");
	}

	public void setCreatedAt(java.util.Date createdAt) {
		set("created_at", createdAt);
	}

	public java.util.Date getCreatedAt() {
		return get("created_at");
	}

	public void setUpdatedAt(java.util.Date updatedAt) {
		set("updated_at", updatedAt);
	}

	public java.util.Date getUpdatedAt() {
		return get("updated_at");
	}
	
	public List<String> getGantEnvs(){
		String str = getStr("gant_envs");
		if(StringUtils.isNotBlank(str)){
			return new ArrayList<>(Arrays.asList(str.split(",")));
		}
		return new ArrayList<>();
	}
	
	public void setGantEnvs(List<String> envs){
		StringBuffer sb = new StringBuffer();
		for (String env : envs) {
			sb.append(env).append(",");
		}
		sb.deleteCharAt(sb.length() - 1);
		set("gant_envs", sb.toString());
	}

}
