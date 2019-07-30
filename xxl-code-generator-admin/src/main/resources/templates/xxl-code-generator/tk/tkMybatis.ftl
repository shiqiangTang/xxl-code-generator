<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="Dao路径.${classInfo.className}Dao">

    <resultMap id="BaseResultMap" type="Model路径.${classInfo.className}" >
    <#if classInfo.fieldList?exists && classInfo.fieldList?size gt 0>
    <#list classInfo.fieldList as fieldItem >
        <result column="${fieldItem.columnName}" jdbcType="${fieldItem.fieldJdbcType}" property="${fieldItem.fieldName}" />
    </#list>
    </#if>
    </resultMap>
</mapper>
