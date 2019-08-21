import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shimingming.senior1.week3.domain.Profession;
import com.shimingming.senior1.week3.domain.Register;
import com.shimingming.senior1.week3.service.IProfessionService;
import com.shimingming.senior1.week3.service.IRegisterService;
import com.sming.commons.utils.IOUtil;
import com.sming.commons.utils.StringUtil;

/**
 * @作者: 时明明
 * @日期: 2019年8月19日
 * @时间: 上午9:00:51
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-root-context.xml")
public class SaveData {
	@Resource
	private IRegisterService irs;
	@Resource
	private IProfessionService ips;
	@Test
	public void getData() {
		URL resource = this.getClass().getResource("week3.txt");
		List<String> list = IOUtil.readTextWithRandomAccessFile(resource.getPath(), "r");
		for (String string : list) {
			System.out.println(string);
			String[] split = string.split("\\|");
			Register reg = new Register();
			for (int i = 0; i < split.length; i++) {
//				于克祥|男|北京市|北京铁研建设监理有限责任公司|工程机械|房屋建筑工程|电力工程|90164|11007719|2021.06.15
				switch (i) {
				case 0:
					if (StringUtil.hasLength(split[0])) {
						reg.setName(split[0]);
					}
					break;
				
				case 1:
					if (StringUtil.hasLength(split[1])) {
						reg.setSex(split[1]);
					}
					break;
				case 2:
					if (StringUtil.hasLength(split[2])) {
						reg.setAddr(split[2]);
					}
					break;
				case 3:
					if (StringUtil.hasLength(split[3])) {
						reg.setCompany(split[3]);
					}
					break;
				case 4:
					if (StringUtil.hasLength(split[4])) {
						reg.setSxzy(split[4]);
					}
					break;
				case 5:
					if (StringUtil.hasLength(split[5])) {
						System.out.println(split[5]);
						QueryWrapper<Profession> qw = new QueryWrapper<>();
						qw.eq("name",split[5]);
						Profession one = ips.getOne(qw);
						System.out.println(one);
						reg.setPid1(one.getId());
						
					}
					break;
				case 6:
					if (StringUtil.hasLength(split[6])) {
						if (StringUtil.hasLength(split[6])) {
							QueryWrapper<Profession> qw = new QueryWrapper<>();
							qw.eq("name",split[6]);
							Profession one = ips.getOne(qw);
							reg.setPid2(one.getId());
							
						}else {
							reg.setPid2(null);
						}
					}
					break;
				case 7:
					if (StringUtil.hasLength(split[7])) {
						reg.setZyzgzsid(split[7]);
					}
					break;
				case 8:
					if (StringUtil.hasLength(split[8])) {
						reg.setRegistid(split[8]);
					}
					break;
				case 9:
					if (StringUtil.hasLength(split[9])) {
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
						Date parse;
						try {
							parse = sdf.parse(split[9]);
							reg.setYxdate(parse);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else {
						
					}
					break;
				}
			}
			irs.save(reg);
		}
	}
}	
