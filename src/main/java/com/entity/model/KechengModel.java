package com.entity.model;

import com.entity.KechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教学视频
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KechengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 教师
     */
    private Integer laoshiId;


    /**
     * 教学视频名称
     */
    private String kechengName;


    /**
     * 教学视频编号
     */
    private String kechengUuidNumber;


    /**
     * 教学视频照片
     */
    private String kechengPhoto;


    /**
     * 教学资料
     */
    private String kechengFile;


    /**
     * 教学视频视频
     */
    private String kechengVideo;


    /**
     * 教学视频类型
     */
    private Integer kechengTypes;


    /**
     * 教学视频热度
     */
    private Integer kechengClicknum;


    /**
     * 教学视频介绍
     */
    private String kechengContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer kechengDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：教师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 设置：教师
	 */
    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 获取：教学视频名称
	 */
    public String getKechengName() {
        return kechengName;
    }


    /**
	 * 设置：教学视频名称
	 */
    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 获取：教学视频编号
	 */
    public String getKechengUuidNumber() {
        return kechengUuidNumber;
    }


    /**
	 * 设置：教学视频编号
	 */
    public void setKechengUuidNumber(String kechengUuidNumber) {
        this.kechengUuidNumber = kechengUuidNumber;
    }
    /**
	 * 获取：教学视频照片
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }


    /**
	 * 设置：教学视频照片
	 */
    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 获取：教学资料
	 */
    public String getKechengFile() {
        return kechengFile;
    }


    /**
	 * 设置：教学资料
	 */
    public void setKechengFile(String kechengFile) {
        this.kechengFile = kechengFile;
    }
    /**
	 * 获取：教学视频视频
	 */
    public String getKechengVideo() {
        return kechengVideo;
    }


    /**
	 * 设置：教学视频视频
	 */
    public void setKechengVideo(String kechengVideo) {
        this.kechengVideo = kechengVideo;
    }
    /**
	 * 获取：教学视频类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 设置：教学视频类型
	 */
    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 获取：教学视频热度
	 */
    public Integer getKechengClicknum() {
        return kechengClicknum;
    }


    /**
	 * 设置：教学视频热度
	 */
    public void setKechengClicknum(Integer kechengClicknum) {
        this.kechengClicknum = kechengClicknum;
    }
    /**
	 * 获取：教学视频介绍
	 */
    public String getKechengContent() {
        return kechengContent;
    }


    /**
	 * 设置：教学视频介绍
	 */
    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getKechengDelete() {
        return kechengDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setKechengDelete(Integer kechengDelete) {
        this.kechengDelete = kechengDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
