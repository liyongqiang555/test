package org.tonzoc.mapper;

import org.apache.ibatis.annotations.Select;
import org.tonzoc.model.AttachmentsModel;

import java.util.List;

public interface AttachmentsMapper extends BaseMapper<AttachmentsModel> {

    @Select("select count(attachments.guid) as sortId, attachments.type from attachments GROUP BY attachments.type")
    List<AttachmentsModel> count ();
}
