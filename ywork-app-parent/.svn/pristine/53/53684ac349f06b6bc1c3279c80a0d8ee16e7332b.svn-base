package me.ywork.salarybill.repository;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import me.ywork.base.repository.IRepository;
import me.ywork.salarybill.entity.SalaryBillLog;
import me.ywork.salarybill.model.SalaryBillLogModel;
import me.ywork.salarybill.model.SalaryBillReadRecordModel;

public interface SalaryBillLogRepository extends IRepository<SalaryBillLog>{

	/**
	 * 获取操作记录条数
	 * @param companyId  企业ID
	 * @return  记录数
	 */
	public Long getSalaryBillLogCount(
			@Param(value = "companyId") String companyId);
	
	/**
	 * 返回操作记录
	 * @param companyId  企业ID
	 * @param skipCount  需要跳过的数量
	 * @param pageSize   每页的数量，即返回的数据行数
	 * @return   投票人员列表
	 */
	public List<SalaryBillLogModel> getSalaryBillLog(
			@Param(value = "companyId") String companyId,
			@Param(value = "skipCount") Integer skipCount,
			@Param(value = "pageSize") Integer pageSize);
	
	
	/**
	 * 阅读记录列表
	 * @param companyId
	 * @param logid
	 * @param skipCount
	 * @param pageSize
	 * @return
	 */
	public List<SalaryBillReadRecordModel> getReadRecord(
			@Param(value = "companyId") String companyId,
			@Param(value = "logid") String logid,
			@Param(value = "skipCount") Integer skipCount,
			@Param(value = "pageSize") Integer pageSize);
	
	
	/**
	 * 软删除
	 * @param companyId  企业ID
	 * @param logId  记录ID
	 * @return
	 */
	public Boolean delLog(
			@Param(value = "companyId") String companyId,
			@Param(value = "logId") String logId
			);
	
	
}
