package me.ywork.salarybill.base;

public interface OrgConstant {
	// ========================组织架构类型========================
	/**
	 * 机构
	 */
	public final static int ORG_TYPE_ORG = 1;

	/**
	 * 部门
	 */
	public final static int ORG_TYPE_DEPT = 2;

	/**
	 * 岗位
	 */
	public final static int ORG_TYPE_POST = 4;

	/**
	 * 个人
	 */
	public final static int ORG_TYPE_PERSON = 8;

	/**
	 * 群组
	 */
	public final static int ORG_TYPE_GROUP = 16;

	/**
	 * 角色
	 */
	public final static int ORG_TYPE_ROLE = 32;
	
	/**
	 * 分身
	 */
	public final static int ORG_TYPE_ACTOR = 64;
	

	/**
	 * 机构或部门
	 */
	public final static int ORG_TYPE_ORGORDEPT = ORG_TYPE_ORG | ORG_TYPE_DEPT;

	/**
	 * 岗位或个人
	 */
	public final static int ORG_TYPE_POSTORPERSON = ORG_TYPE_POST
			| ORG_TYPE_PERSON | ORG_TYPE_ACTOR;

	/**
	 * 所有组织架构
	 */
	public final static int ORG_TYPE_ALLORG = ORG_TYPE_ORGORDEPT
			| ORG_TYPE_POSTORPERSON;

	/**
	 * 所有类型
	 */
	public final static int ORG_TYPE_ALL = ORG_TYPE_ALLORG | ORG_TYPE_GROUP;

	/**
	 * 组织架构类型默认值
	 */
	public final static int ORG_TYPE_DEFAULT = ORG_TYPE_ALL;

	// ========================组织架构标记========================
	/**
	 * 有效
	 */
	public final static int ORG_FLAG_AVAILABLEYES = 0x100;

	/**
	 * 无效
	 */
	public final static int ORG_FLAG_AVAILABLENO = 0x200;

	/**
	 * 不管是否有效
	 */
	public final static int ORG_FLAG_AVAILABLEALL = ORG_FLAG_AVAILABLEYES
			| ORG_FLAG_AVAILABLENO;

	/**
	 * 有效性的默认值
	 */
	public final static int ORG_FLAG_AVAILABLEDEFAULT = ORG_FLAG_AVAILABLEYES;

	/**
	 * 业务相关
	 */
	public final static int ORG_FLAG_BUSINESSYES = 0x400;

	/**
	 * 业务无关
	 */
	public final static int ORG_FLAG_BUSINESSNO = 0x800;

	/**
	 * 不管是否业务相关
	 */
	public final static int ORG_FLAG_BUSINESSALL = ORG_FLAG_BUSINESSYES
			| ORG_FLAG_BUSINESSNO;

	/**
	 * 是否业务相关的默认值
	 */
	public final static int ORG_FLAG_BUSINESSDEFAULT = ORG_FLAG_BUSINESSYES;

	/**
	 * 不管任何标记
	 */
	public final static int ORG_FLAG_ALL = ORG_FLAG_AVAILABLEALL
			| ORG_FLAG_BUSINESSALL;

	/**
	 * 标记默认值
	 */
	public final static int ORG_FLAG_DEFAULT = ORG_FLAG_AVAILABLEDEFAULT
			| ORG_FLAG_BUSINESSDEFAULT;

}
