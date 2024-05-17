package plan.dao;

import java.util.List;

import plan.vo.CombinePlanVO;

public interface IPlanDao {
	
//	public int planInsert(CombinePlanVO cpv);
	
//	public int planInsertDetail(CombinePlanVO cpv);
	
	public int planInsertWithDetails(CombinePlanVO cpv, List<CombinePlanVO> detailList);
	
	public List<CombinePlanVO> selectMyPlanList(String mem_id);

	public List<CombinePlanVO> planListByCity(int city_num);
	
	public String getPlanCityName(int city_num);

}
