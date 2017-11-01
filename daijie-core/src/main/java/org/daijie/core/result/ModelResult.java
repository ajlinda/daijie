package org.daijie.core.result;

import io.swagger.annotations.ApiModelProperty;


/**
 * 基于swagger api模式
 * 接口请求返回实体
 * @author daijie
 * @date 2017年10月27日
 * @param <E>
 */
public class ModelResult<E> {

	@ApiModelProperty(value="请求状态码")
	protected String code;
	
	@ApiModelProperty(value="是否请求成功")
	protected boolean success;
	
	@ApiModelProperty(value="返回消息提示")
	protected String msg;
	
	@ApiModelProperty(value="返回数据对象")
	protected E data;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
}