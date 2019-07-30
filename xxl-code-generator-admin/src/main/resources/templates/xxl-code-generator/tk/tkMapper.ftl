import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* ${classInfo.classComment}
*
* Created by ericer on '${.now?string('yyyy-MM-dd HH:mm:ss')}'.
*/
public interface ${classInfo.className}Mapper  extends Mapper<${classInfo.className}>, MySqlMapper<${classInfo.className}>{
}
