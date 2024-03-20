package com.entity.vo;

import com.entity.KechengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教学视频
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kecheng")
public class KechengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 教师
     */

    @TableField(value = "laoshi_id")
    private Integer laoshiId;


    /**
     * 教学视频名称
     */

    @TableField(value = "kecheng_name")
    private String kechengName;


    /**
     * 教学视频编号
     */

    @TableField(value = "kecheng_uuid_number")
    private String kechengUuidNumber;


    /**
     * 教学视频照片
     */

    @TableField(value = "kecheng_photo")
    private String kechengPhoto;


    /**
     * 教学资料
     */

    @TableField(value = "kecheng_file")
    private String kechengFile;


    /**
     * 教学视频视频
     */

    @TableField(value = "kecheng_video")
    private String kechengVideo;


    /**
     * 教学视频类型
     */

    @TableField(value = "kecheng_types")
    private Integer kechengTypes;


    /**
     * 教学视频热度
     */

    @TableField(value = "kecheng_clicknum")
    private Integer kechengClicknum;


    /**
     * 教学视频介绍
     */

    @TableField(value = "kecheng_content")
    private String kechengContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "kecheng_delete")
    private Integer kechengDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：教师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 获取：教师
	 */

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 设置：教学视频名称
	 */
    public String getKechengName() {
        return kechengName;
    }


    /**
	 * 获取：教学视频名称
	 */

    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 设置：教学视频编号
	 */
    public String getKechengUuidNumber() {
        return kechengUuidNumber;
    }


    /**
	 * 获取：教学视频编号
	 */

    public void setKechengUuidNumber(String kechengUuidNumber) {
        this.kechengUuidNumber = kechengUuidNumber;
    }
    /**
	 * 设置：教学视频照片
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }


    /**
	 * 获取：教学视频照片
	 */

    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 设置：教学资料
	 */
    public String getKechengFile() {
        return kechengFile;
    }


    /**
	 * 获取：教学资料
	 */

    public void setKechengFile(String kechengFile) {
        this.kechengFile = kechengFile;
    }
    /**
	 * 设置：教学视频视频
	 */
    public String getKechengVideo() {
        return kechengVideo;
    }


    /**
	 * 获取：教学视频视频
	 */

    public void setKechengVideo(String kechengVideo) {
        this.kechengVideo = kechengVideo;
    }
    /**
	 * 设置：教学视频类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 获取：教学视频类型
	 */

    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 设置：教学视频热度
	 */
    public Integer getKechengClicknum() {
        return kechengClicknum;
    }


    /**
	 * 获取：教学视频热度
	 */

    public void setKechengClicknum(Integer kechengClicknum) {
        this.kechengClicknum = kechengClicknum;
    }
    /**
	 * 设置：教学视频介绍
	 */
    public String getKechengContent() {
        return kechengContent;
    }


    /**
	 * 获取：教学视频介绍
	 */

    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getKechengDelete() {
        return kechengDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setKechengDelete(Integer kechengDelete) {
        this.kechengDelete = kechengDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
