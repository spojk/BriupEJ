package com.briup.apps.briupej.mapper.extend;
import com.briup.apps.briupej.bean.extend.CommentExtend;

import java.util.List;

public interface CommentExtendMapper {

    List<CommentExtend> selectAll(long id);

}
