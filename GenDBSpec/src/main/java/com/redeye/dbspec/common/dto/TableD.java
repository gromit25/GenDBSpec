package com.redeye.dbspec.common.dto;

import lombok.Data;

/**
 * 테이블 정보 DTO
 * 
 * @author jmsohn
 */
@Data
public class TableD {

	/** 스키마 아이디 */
	private int schemaId;
	
	/** 테이블 명 */
	private String tableName;
	
	/** 테이블 주석 */
	private String description;
}
