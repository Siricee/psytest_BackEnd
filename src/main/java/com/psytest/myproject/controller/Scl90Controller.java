package com.psytest.myproject.controller;

import com.psytest.myproject.bean.Scl90;
import com.psytest.myproject.bean.Scl90Example;
import com.psytest.myproject.service.Scl90Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/scl90")
public class Scl90Controller {

    @Resource
    private Scl90Service scl90Service;

    /**
     * 获取所有用户sas答题历史
     *
     * @param request
     * @return
     */
    @RequestMapping("/history_list")
    @ResponseBody
    List<Scl90> selectByExample(HttpServletRequest request) {
        return scl90Service.selectByExample(new Scl90Example());
    }


    /**
     * 获取某个用户的sas提交历史
     *
     * @param request
     * @return
     */
    @RequestMapping("/history_list/user")
    @ResponseBody
    List<Scl90> selectHistoryByUserId(HttpServletRequest request) {
        Scl90Example scl90Example = new Scl90Example();
        Scl90Example.Criteria scl90ExampleCriteria = scl90Example.createCriteria();
        scl90ExampleCriteria.andUseridEqualTo(Integer.parseInt(request.getParameter("userid")));

        return scl90Service.selectByExample(scl90Example);
    }

    /**
     * 根据记录的主键删除某条sas记录
     *
     * @param request
     * @return
     */
    @RequestMapping("/history_list/delete")
    @ResponseBody
    public int deleteByPrimaryKey(HttpServletRequest request) {
        int recordId = Integer.parseInt(request.getParameter("id"));
        return scl90Service.deleteByPrimaryKey(recordId);
    }

    /**
     * 提交当前问卷记录
     * <p>
     * 总分 = 标准分（求和）*1.25 取整
     *
     * @param request
     * @return
     */
    @PostMapping("/commit")
    @ResponseBody
    public int insertSelective(HttpServletRequest request) {
        Scl90 scl90 = new Scl90();

        Date date = new Date(); // 注意是java.util.Date类
        Timestamp timestamp = new Timestamp(date.getTime());
//      System.out.println(timestamp); // 2019-04-07 20:08:01.055

        scl90.setUserid(Integer.parseInt(request.getParameter("userid")));
        scl90.setTime(timestamp);

        scl90.setAnswer1(Integer.parseInt(request.getParameter("answer1")));
        scl90.setAnswer2(Integer.parseInt(request.getParameter("answer2")));
        scl90.setAnswer3(Integer.parseInt(request.getParameter("answer3")));
        scl90.setAnswer4(Integer.parseInt(request.getParameter("answer4")));
        scl90.setAnswer5(Integer.parseInt(request.getParameter("answer5")));
        scl90.setAnswer6(Integer.parseInt(request.getParameter("answer6")));
        scl90.setAnswer7(Integer.parseInt(request.getParameter("answer7")));
        scl90.setAnswer8(Integer.parseInt(request.getParameter("answer8")));
        scl90.setAnswer9(Integer.parseInt(request.getParameter("answer9")));
        scl90.setAnswer10(Integer.parseInt(request.getParameter("answer10")));
        scl90.setAnswer11(Integer.parseInt(request.getParameter("answer11")));
        scl90.setAnswer12(Integer.parseInt(request.getParameter("answer12")));
        scl90.setAnswer13(Integer.parseInt(request.getParameter("answer13")));
        scl90.setAnswer14(Integer.parseInt(request.getParameter("answer14")));
        scl90.setAnswer15(Integer.parseInt(request.getParameter("answer15")));
        scl90.setAnswer16(Integer.parseInt(request.getParameter("answer16")));
        scl90.setAnswer17(Integer.parseInt(request.getParameter("answer17")));
        scl90.setAnswer18(Integer.parseInt(request.getParameter("answer18")));
        scl90.setAnswer19(Integer.parseInt(request.getParameter("answer19")));
        scl90.setAnswer20(Integer.parseInt(request.getParameter("answer20")));
        scl90.setAnswer21(Integer.parseInt(request.getParameter("answer21")));
        scl90.setAnswer22(Integer.parseInt(request.getParameter("answer22")));
        scl90.setAnswer23(Integer.parseInt(request.getParameter("answer23")));
        scl90.setAnswer24(Integer.parseInt(request.getParameter("answer24")));
        scl90.setAnswer25(Integer.parseInt(request.getParameter("answer25")));
        scl90.setAnswer26(Integer.parseInt(request.getParameter("answer26")));
        scl90.setAnswer27(Integer.parseInt(request.getParameter("answer27")));
        scl90.setAnswer28(Integer.parseInt(request.getParameter("answer28")));
        scl90.setAnswer29(Integer.parseInt(request.getParameter("answer29")));
        scl90.setAnswer30(Integer.parseInt(request.getParameter("answer30")));
        scl90.setAnswer31(Integer.parseInt(request.getParameter("answer31")));
        scl90.setAnswer32(Integer.parseInt(request.getParameter("answer32")));
        scl90.setAnswer33(Integer.parseInt(request.getParameter("answer33")));
        scl90.setAnswer34(Integer.parseInt(request.getParameter("answer34")));
        scl90.setAnswer35(Integer.parseInt(request.getParameter("answer35")));
        scl90.setAnswer36(Integer.parseInt(request.getParameter("answer36")));
        scl90.setAnswer37(Integer.parseInt(request.getParameter("answer37")));
        scl90.setAnswer38(Integer.parseInt(request.getParameter("answer38")));
        scl90.setAnswer39(Integer.parseInt(request.getParameter("answer39")));
        scl90.setAnswer40(Integer.parseInt(request.getParameter("answer40")));
        scl90.setAnswer41(Integer.parseInt(request.getParameter("answer41")));
        scl90.setAnswer42(Integer.parseInt(request.getParameter("answer42")));
        scl90.setAnswer43(Integer.parseInt(request.getParameter("answer43")));
        scl90.setAnswer44(Integer.parseInt(request.getParameter("answer44")));
        scl90.setAnswer45(Integer.parseInt(request.getParameter("answer45")));
        scl90.setAnswer46(Integer.parseInt(request.getParameter("answer46")));
        scl90.setAnswer47(Integer.parseInt(request.getParameter("answer47")));
        scl90.setAnswer48(Integer.parseInt(request.getParameter("answer48")));
        scl90.setAnswer49(Integer.parseInt(request.getParameter("answer49")));
        scl90.setAnswer50(Integer.parseInt(request.getParameter("answer50")));
        scl90.setAnswer51(Integer.parseInt(request.getParameter("answer51")));
        scl90.setAnswer52(Integer.parseInt(request.getParameter("answer52")));
        scl90.setAnswer53(Integer.parseInt(request.getParameter("answer53")));
        scl90.setAnswer54(Integer.parseInt(request.getParameter("answer54")));
        scl90.setAnswer55(Integer.parseInt(request.getParameter("answer55")));
        scl90.setAnswer56(Integer.parseInt(request.getParameter("answer56")));
        scl90.setAnswer57(Integer.parseInt(request.getParameter("answer57")));
        scl90.setAnswer58(Integer.parseInt(request.getParameter("answer58")));
        scl90.setAnswer59(Integer.parseInt(request.getParameter("answer59")));
        scl90.setAnswer60(Integer.parseInt(request.getParameter("answer60")));
        scl90.setAnswer61(Integer.parseInt(request.getParameter("answer61")));
        scl90.setAnswer62(Integer.parseInt(request.getParameter("answer62")));
        scl90.setAnswer63(Integer.parseInt(request.getParameter("answer63")));
        scl90.setAnswer64(Integer.parseInt(request.getParameter("answer64")));
        scl90.setAnswer65(Integer.parseInt(request.getParameter("answer65")));
        scl90.setAnswer66(Integer.parseInt(request.getParameter("answer66")));
        scl90.setAnswer67(Integer.parseInt(request.getParameter("answer67")));
        scl90.setAnswer68(Integer.parseInt(request.getParameter("answer68")));
        scl90.setAnswer69(Integer.parseInt(request.getParameter("answer69")));
        scl90.setAnswer70(Integer.parseInt(request.getParameter("answer70")));
        scl90.setAnswer71(Integer.parseInt(request.getParameter("answer71")));
        scl90.setAnswer72(Integer.parseInt(request.getParameter("answer72")));
        scl90.setAnswer73(Integer.parseInt(request.getParameter("answer73")));
        scl90.setAnswer74(Integer.parseInt(request.getParameter("answer74")));
        scl90.setAnswer75(Integer.parseInt(request.getParameter("answer75")));
        scl90.setAnswer76(Integer.parseInt(request.getParameter("answer76")));
        scl90.setAnswer77(Integer.parseInt(request.getParameter("answer77")));
        scl90.setAnswer78(Integer.parseInt(request.getParameter("answer78")));
        scl90.setAnswer79(Integer.parseInt(request.getParameter("answer79")));
        scl90.setAnswer80(Integer.parseInt(request.getParameter("answer80")));
        scl90.setAnswer81(Integer.parseInt(request.getParameter("answer81")));
        scl90.setAnswer82(Integer.parseInt(request.getParameter("answer82")));
        scl90.setAnswer83(Integer.parseInt(request.getParameter("answer83")));
        scl90.setAnswer84(Integer.parseInt(request.getParameter("answer84")));
        scl90.setAnswer85(Integer.parseInt(request.getParameter("answer85")));
        scl90.setAnswer86(Integer.parseInt(request.getParameter("answer86")));
        scl90.setAnswer87(Integer.parseInt(request.getParameter("answer87")));
        scl90.setAnswer88(Integer.parseInt(request.getParameter("answer88")));
        scl90.setAnswer89(Integer.parseInt(request.getParameter("answer89")));
        scl90.setAnswer90(Integer.parseInt(request.getParameter("answer90")));

        int posSymptomCount = 0;
        int negSymptomCount = 0;
        int posSymptomSumscore = 0;
        for (int i = 1; i <= 90; i++) {
            int value = Integer.parseInt(request.getParameter("answer" + i));

            if(value>=2){
                posSymptomCount+=1;
                posSymptomSumscore += value;
            }else negSymptomCount+=1;
        }


        // caculations:
        scl90.setSumscore(scl90.getAnswer1() + scl90.getAnswer2() + scl90.getAnswer3() + scl90.getAnswer4() + scl90.getAnswer5() + scl90.getAnswer6() + scl90.getAnswer7() + scl90.getAnswer8() + scl90.getAnswer9() + scl90.getAnswer10() + scl90.getAnswer11() + scl90.getAnswer12() + scl90.getAnswer13() + scl90.getAnswer14() + scl90.getAnswer15() + scl90.getAnswer16() + scl90.getAnswer17() + scl90.getAnswer18() + scl90.getAnswer19() + scl90.getAnswer20() + scl90.getAnswer21() + scl90.getAnswer22() + scl90.getAnswer23() + scl90.getAnswer24() + scl90.getAnswer25() + scl90.getAnswer26() + scl90.getAnswer27() + scl90.getAnswer28() + scl90.getAnswer29() + scl90.getAnswer30() + scl90.getAnswer31() + scl90.getAnswer32() + scl90.getAnswer33() + scl90.getAnswer34() + scl90.getAnswer35() + scl90.getAnswer36() + scl90.getAnswer37() + scl90.getAnswer38() + scl90.getAnswer39() + scl90.getAnswer40() + scl90.getAnswer41() + scl90.getAnswer42() + scl90.getAnswer43() + scl90.getAnswer44() + scl90.getAnswer45() + scl90.getAnswer46() + scl90.getAnswer47() + scl90.getAnswer48() + scl90.getAnswer49() + scl90.getAnswer50() + scl90.getAnswer51() + scl90.getAnswer52() + scl90.getAnswer53() + scl90.getAnswer54() + scl90.getAnswer55() + scl90.getAnswer56() + scl90.getAnswer57() + scl90.getAnswer58() + scl90.getAnswer59() + scl90.getAnswer60() + scl90.getAnswer61() + scl90.getAnswer62() + scl90.getAnswer63() + scl90.getAnswer64() + scl90.getAnswer65() + scl90.getAnswer66() + scl90.getAnswer67() + scl90.getAnswer68() + scl90.getAnswer69() + scl90.getAnswer70() + scl90.getAnswer71() + scl90.getAnswer72() + scl90.getAnswer73() + scl90.getAnswer74() + scl90.getAnswer75() + scl90.getAnswer76() + scl90.getAnswer77() + scl90.getAnswer78() + scl90.getAnswer79() + scl90.getAnswer80() + scl90.getAnswer81() + scl90.getAnswer82() + scl90.getAnswer83() + scl90.getAnswer84() + scl90.getAnswer85() + scl90.getAnswer86() + scl90.getAnswer87() + scl90.getAnswer88() + scl90.getAnswer89() + scl90.getAnswer90());

        // pos,neg factor
        scl90.setPosSymptomCount(posSymptomCount);
        scl90.setNegSymptomCount(negSymptomCount);

        // Positive-Symptom-Average-score
        if (posSymptomCount == 0) {
            scl90.setPosSymptomAvgscore((float) 0);
        } else {
            scl90.setPosSymptomAvgscore((float) (posSymptomSumscore / posSymptomCount));
        }

        // single factor

        // somatization 躯体化
        scl90.setSomatization(scl90.getAnswer1()+scl90.getAnswer4()+scl90.getAnswer12()+scl90.getAnswer27()+scl90.getAnswer40()+scl90.getAnswer42()+scl90.getAnswer48()+scl90.getAnswer49()+scl90.getAnswer52()+scl90.getAnswer53()+scl90.getAnswer56()+scl90.getAnswer58());
        // obsessive 强迫症状
        scl90.setObsessive(scl90.getAnswer3()+scl90.getAnswer9()+scl90.getAnswer10()+scl90.getAnswer10()+scl90.getAnswer28()+scl90.getAnswer38()+scl90.getAnswer45()+scl90.getAnswer46()+scl90.getAnswer51()+scl90.getAnswer55()+scl90.getAnswer65());
        // interpersonal 人际关系敏感
        scl90.setInterpersonal(scl90.getAnswer6()+scl90.getAnswer21()+scl90.getAnswer34()+scl90.getAnswer36()+scl90.getAnswer37()+scl90.getAnswer41()+scl90.getAnswer61()+scl90.getAnswer69()+scl90.getAnswer73());
        // depression 抑郁
        scl90.setDepression(scl90.getAnswer5()+scl90.getAnswer14()+scl90.getAnswer15()+scl90.getAnswer20()+scl90.getAnswer22()+scl90.getAnswer26()+scl90.getAnswer29()+scl90.getAnswer30()+scl90.getAnswer31()+scl90.getAnswer32()+scl90.getAnswer54()+scl90.getAnswer71()+scl90.getAnswer79());
        // anxiety 焦虑
        scl90.setAnxiety(scl90.getAnswer2()+scl90.getAnswer17()+scl90.getAnswer23()+scl90.getAnswer33()+scl90.getAnswer39()+scl90.getAnswer57()+scl90.getAnswer72()+scl90.getAnswer78()+scl90.getAnswer80()+scl90.getAnswer86());
        // hostility 敌对
        scl90.setHostility(scl90.getAnswer11()+scl90.getAnswer24()+scl90.getAnswer63()+scl90.getAnswer67()+scl90.getAnswer74()+scl90.getAnswer81());
        // phobic 恐怖
        scl90.setPhobic(scl90.getAnswer13()+scl90.getAnswer25()+scl90.getAnswer47()+scl90.getAnswer50()+scl90.getAnswer70()+scl90.getAnswer75()+scl90.getAnswer82());
        // paranoid 偏执
        scl90.setParanoid(scl90.getAnswer8()+scl90.getAnswer18()+scl90.getAnswer43()+scl90.getAnswer68()+scl90.getAnswer76()+scl90.getAnswer83());
        // psychoticism 精神病性
        scl90.setPsychoticism(scl90.getAnswer7()+scl90.getAnswer16()+scl90.getAnswer35()+scl90.getAnswer62()+scl90.getAnswer77()+scl90.getAnswer84()+scl90.getAnswer85()+scl90.getAnswer87()+scl90.getAnswer88()+scl90.getAnswer90());

        return scl90Service.insertSelective(scl90);
    }

    @RequestMapping("/history_list_detail")
    @ResponseBody
    List<Scl90> getRecordWithUserinfo(HttpServletRequest request){
        return scl90Service.getRecordWithUserinfo();
    }

}
