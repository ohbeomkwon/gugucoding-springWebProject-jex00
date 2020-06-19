package org.zeroch.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("SELECT sysdate FROM dual")
	public String getTime();

	
//	SQL 문이 복잡할 경우, xml 파일을 따로 만들어서 SQL문을 작성하고 연결시킨다.
//	xml파일은 resources 폴더 아래에 mapper 패키지와 같은 경로에 있다.
	public String getTime2();
}
