package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.KechengCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 教学视频收藏
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("kecheng_collection")
public class KechengCollectionView extends KechengCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 类型的值
	*/
	@ColumnInfo(comment="类型的字典表值",type="varchar(200)")
	private String kechengCollectionValue;

	//级联表 教学视频
					 
		/**
		* 教学视频 的 教师
		*/
		@ColumnInfo(comment="教师",type="int(11)")
		private Integer kechengLaoshiId;
		/**
		* 教学视频名称
		*/

		@ColumnInfo(comment="教学视频名称",type="varchar(200)")
		private String kechengName;
		/**
		* 教学视频编号
		*/

		@ColumnInfo(comment="教学视频编号",type="varchar(200)")
		private String kechengUuidNumber;
		/**
		* 教学视频照片
		*/

		@ColumnInfo(comment="教学视频照片",type="varchar(200)")
		private String kechengPhoto;
		/**
		* 教学资料
		*/

		@ColumnInfo(comment="教学资料",type="varchar(200)")
		private String kechengFile;
		/**
		* 教学视频视频
		*/

		@ColumnInfo(comment="教学视频视频",type="varchar(200)")
		private String kechengVideo;
		/**
		* 教学视频类型
		*/
		@ColumnInfo(comment="教学视频类型",type="int(11)")
		private Integer kechengTypes;
			/**
			* 教学视频类型的值
			*/
			@ColumnInfo(comment="教学视频类型的字典表值",type="varchar(200)")
			private String kechengValue;
		/**
		* 教学视频热度
		*/

		@ColumnInfo(comment="教学视频热度",type="int(11)")
		private Integer kechengClicknum;
		/**
		* 教学视频介绍
		*/

		@ColumnInfo(comment="教学视频介绍",type="text")
		private String kechengContent;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer kechengDelete;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String yonghuEmail;



	public KechengCollectionView() {

	}

	public KechengCollectionView(KechengCollectionEntity kechengCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, kechengCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 类型的值
	*/
	public String getKechengCollectionValue() {
		return kechengCollectionValue;
	}
	/**
	* 设置： 类型的值
	*/
	public void setKechengCollectionValue(String kechengCollectionValue) {
		this.kechengCollectionValue = kechengCollectionValue;
	}


	//级联表的get和set 教学视频
		/**
		* 获取：教学视频 的 教师
		*/
		public Integer getKechengLaoshiId() {
			return kechengLaoshiId;
		}
		/**
		* 设置：教学视频 的 教师
		*/
		public void setKechengLaoshiId(Integer kechengLaoshiId) {
			this.kechengLaoshiId = kechengLaoshiId;
		}

		/**
		* 获取： 教学视频名称
		*/
		public String getKechengName() {
			return kechengName;
		}
		/**
		* 设置： 教学视频名称
		*/
		public void setKechengName(String kechengName) {
			this.kechengName = kechengName;
		}

		/**
		* 获取： 教学视频编号
		*/
		public String getKechengUuidNumber() {
			return kechengUuidNumber;
		}
		/**
		* 设置： 教学视频编号
		*/
		public void setKechengUuidNumber(String kechengUuidNumber) {
			this.kechengUuidNumber = kechengUuidNumber;
		}

		/**
		* 获取： 教学视频照片
		*/
		public String getKechengPhoto() {
			return kechengPhoto;
		}
		/**
		* 设置： 教学视频照片
		*/
		public void setKechengPhoto(String kechengPhoto) {
			this.kechengPhoto = kechengPhoto;
		}

		/**
		* 获取： 教学资料
		*/
		public String getKechengFile() {
			return kechengFile;
		}
		/**
		* 设置： 教学资料
		*/
		public void setKechengFile(String kechengFile) {
			this.kechengFile = kechengFile;
		}

		/**
		* 获取： 教学视频视频
		*/
		public String getKechengVideo() {
			return kechengVideo;
		}
		/**
		* 设置： 教学视频视频
		*/
		public void setKechengVideo(String kechengVideo) {
			this.kechengVideo = kechengVideo;
		}
		/**
		* 获取： 教学视频类型
		*/
		public Integer getKechengTypes() {
			return kechengTypes;
		}
		/**
		* 设置： 教学视频类型
		*/
		public void setKechengTypes(Integer kechengTypes) {
			this.kechengTypes = kechengTypes;
		}


			/**
			* 获取： 教学视频类型的值
			*/
			public String getKechengValue() {
				return kechengValue;
			}
			/**
			* 设置： 教学视频类型的值
			*/
			public void setKechengValue(String kechengValue) {
				this.kechengValue = kechengValue;
			}

		/**
		* 获取： 教学视频热度
		*/
		public Integer getKechengClicknum() {
			return kechengClicknum;
		}
		/**
		* 设置： 教学视频热度
		*/
		public void setKechengClicknum(Integer kechengClicknum) {
			this.kechengClicknum = kechengClicknum;
		}

		/**
		* 获取： 教学视频介绍
		*/
		public String getKechengContent() {
			return kechengContent;
		}
		/**
		* 设置： 教学视频介绍
		*/
		public void setKechengContent(String kechengContent) {
			this.kechengContent = kechengContent;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getKechengDelete() {
			return kechengDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setKechengDelete(Integer kechengDelete) {
			this.kechengDelete = kechengDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "KechengCollectionView{" +
			", kechengCollectionValue=" + kechengCollectionValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", kechengName=" + kechengName +
			", kechengUuidNumber=" + kechengUuidNumber +
			", kechengPhoto=" + kechengPhoto +
			", kechengFile=" + kechengFile +
			", kechengVideo=" + kechengVideo +
			", kechengClicknum=" + kechengClicknum +
			", kechengContent=" + kechengContent +
			", kechengDelete=" + kechengDelete +
			"} " + super.toString();
	}
}
