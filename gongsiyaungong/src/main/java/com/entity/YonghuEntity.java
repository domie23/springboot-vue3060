package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 员工
 *
 * @author 
 * @email
 */
@TableName("yonghu")
public class YonghuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YonghuEntity() {

	}

	public YonghuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 员工姓名
     */
    @TableField(value = "yonghu_name")

    private String yonghuName;


    /**
     * 头像
     */
    @TableField(value = "yonghu_photo")

    private String yonghuPhoto;


    /**
     * 手机号
     */
    @TableField(value = "yonghu_phone")

    private String yonghuPhone;


    /**
     * 电子邮箱
     */
    @TableField(value = "yonghu_email")

    private String yonghuEmail;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 部门
     */
    @TableField(value = "bumen_types")

    private Integer bumenTypes;


    /**
     * 假删
     */
    @TableField(value = "yonghu_delete")

    private Integer yonghuDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：员工姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }
    /**
	 * 获取：员工姓名
	 */

    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 设置：头像
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }
    /**
	 * 获取：头像
	 */

    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 设置：手机号
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }
    /**
	 * 获取：手机号
	 */

    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getYonghuEmail() {
        return yonghuEmail;
    }
    /**
	 * 获取：电子邮箱
	 */

    public void setYonghuEmail(String yonghuEmail) {
        this.yonghuEmail = yonghuEmail;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：部门
	 */
    public Integer getBumenTypes() {
        return bumenTypes;
    }
    /**
	 * 获取：部门
	 */

    public void setBumenTypes(Integer bumenTypes) {
        this.bumenTypes = bumenTypes;
    }
    /**
	 * 设置：假删
	 */
    public Integer getYonghuDelete() {
        return yonghuDelete;
    }
    /**
	 * 获取：假删
	 */

    public void setYonghuDelete(Integer yonghuDelete) {
        this.yonghuDelete = yonghuDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yonghu{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", yonghuName=" + yonghuName +
            ", yonghuPhoto=" + yonghuPhoto +
            ", yonghuPhone=" + yonghuPhone +
            ", yonghuEmail=" + yonghuEmail +
            ", sexTypes=" + sexTypes +
            ", bumenTypes=" + bumenTypes +
            ", yonghuDelete=" + yonghuDelete +
            ", createTime=" + createTime +
        "}";
    }
}
