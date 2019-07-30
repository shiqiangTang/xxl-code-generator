package com.xxl.codegenerator.admin.core.util;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MultiHashtable;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;

import java.math.BigDecimal;
import java.sql.*;

/**
 * Licensed to CMIM,Inc.under the terms of the CMIM
 * Software License version 1.0.
 * <p>
 * See the NOTICE filed is tributed with this work for additional *
 * information regarding copyright ownership.
 * ---------------------------------------------------------------------------
 * Date Author Version Comments
 * 2019/7/30 ericer 1.0 InitialVersion
 **/
public class JavaTypeToJDBCType {

	private static final MultiHashtable<Class, JDBCType> JavaType2JDBCTypeMap = new MultiHashtable<>();


	static {
		JavaType2JDBCTypeMap.put(String.class, JDBCType.CHAR);
		JavaType2JDBCTypeMap.put(String.class, JDBCType.VARCHAR);
		JavaType2JDBCTypeMap.put(String.class, JDBCType.LONGVARCHAR);

		JavaType2JDBCTypeMap.put(BigDecimal.class, JDBCType.NUMERIC);
		JavaType2JDBCTypeMap.put(BigDecimal.class, JDBCType.DECIMAL);

		JavaType2JDBCTypeMap.put(Boolean.class, JDBCType.BIT);
		JavaType2JDBCTypeMap.put(Boolean.class, JDBCType.BOOLEAN);
		JavaType2JDBCTypeMap.put(Byte.class, JDBCType.TINYINT);
		JavaType2JDBCTypeMap.put(Short.class, JDBCType.SMALLINT);
		JavaType2JDBCTypeMap.put(Integer.class, JDBCType.INTEGER);
		JavaType2JDBCTypeMap.put(Long.class, JDBCType.BIGINT);
		JavaType2JDBCTypeMap.put(Float.class, JDBCType.REAL);
		JavaType2JDBCTypeMap.put(Double.class, JDBCType.DOUBLE);

		JavaType2JDBCTypeMap.put(Date.class, JDBCType.DATE);
		JavaType2JDBCTypeMap.put(Time.class, JDBCType.TIME);
		JavaType2JDBCTypeMap.put(Timestamp.class, JDBCType.TIMESTAMP);

		JavaType2JDBCTypeMap.put(Clob.class, JDBCType.CLOB);
		JavaType2JDBCTypeMap.put(Blob.class, JDBCType.BLOB);
		JavaType2JDBCTypeMap.put(Array.class, JDBCType.ARRAY);
		JavaType2JDBCTypeMap.put(Byte[].class, JDBCType.BINARY);
		JavaType2JDBCTypeMap.put(Byte[].class, JDBCType.VARBINARY);
		JavaType2JDBCTypeMap.put(Byte[].class, JDBCType.LONGVARBINARY);
	}



}
