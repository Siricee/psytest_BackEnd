## 本项目为毕设自用。

<small>Author:Sirice</small>

### bean key explanation

User:
 - "id" 自增
 - "username"
 - "password"
 - "authority":2  权限等级，0超管1普通管理&分析人员2注册用户
 - "age":20,  
 - "sex":1, 性别，男1女2
 - "work":I, 枚举型。
         A 农、林、牧、渔业； 
         B 采矿业； 
         C 制造业； 
         D 电力、热力、燃气及水生产和供应业； 
         E 建筑业； 
         F 批发和零售业； 
         G 交通运输、仓储和邮政业； 
         H 住宿和餐饮业； 
         I 信息传输、软件和信息技术服务业； 
         J 金融业； 
         K 房地产业；
         L 租赁和商务服务业； 
         M 科学研究和技术服务业； 
         N 水利、环境和公共设施管理业； 
         O 居民服务、修理和其他服务业； 
         P 教育； 
         Q 卫生和社会工作； 
         R 文化、体育和娱乐业； 
         S 公共管理、社会保障和社会组织； 
         T 国际组织
         Y 无业
         Z 其他
 - "location":"北京", 地理位置，枚举型字符串。
         具体看citySelection控件实现。
 - "salary":1, 年收入范围，枚举型
 
         1. 1000元以下
         2. 1000-1999元
         3. 2000-3999元
         4. 4000-5999元
         5. 6000-9999元
         6. 10000-19999元
         7. 20000元以上
         
 - "marriage":0 是否已婚，1已婚0未婚。
 
 SCL90:
  
1. 躯体化(1-5分) somatization: 包括1,4,12,27,40,42,48,49,52,53,56和58,共12项。
该因子主要反映身体不适感，包括心血管、胃肠道、呼吸和其他系统的主诉不适和头痛、背痛、肌肉酸痛，以及焦虑的其他躯体表现。
 
2. 强迫症状(1-5分) obsessive: 3,9,10,28,38,45,46,51,55和65，共10项
该因子主要指那些明知没有必要，但又无法摆脱的无意义的思想、冲动和行为，还有一些比较一般的感知障碍(如“脑子都变空了”，“记忆力不行”等)也在这一因子中反映。
 
3. 人际关系敏感(1-5分) interpersonal: 包括6,21,34,36,37,41,61,69和73，共9项。
该因子主要指某些一个人不自在与自卑感，特别是与其他人相比较时更加突出。在人际交往中的自卑感，心神不安，明显不自在，以及人际交流中的自我意识，消极的期待亦是这方面症状的典型原因。
 
4. 抑郁(1-5分) depression: 包括5,14,15,20,22,26,29,30,31,32,54,71和79，共13项。
该因子主要指苦闷的情感与心境为代表性症状，还以对生活兴趣的减退，缺乏活动愿望，丧失活动力等为特征。还反映失望，悲观以及与抑郁相联系的认知和躯体方面的感受，另外，还包括有关死亡的思想和自杀观念。
 
5. 焦虑(1-5分) anxiety: 包括2,17,23,33,39,57,72,78,80和86，共10个项目。
该因子指那些烦躁，坐立不安，神经过敏，紧张以及由此产生的躯体征象，如震颤等。那种游离不定的焦虑及惊恐发作是本因子的主要内容，还包括一项反映“解体”的项目。
 
6. 敌对(1-5分) hostility: 包括11,24,63,67,74和81，共6项。
该因子主要从三方面来反映敌对的表现：思想、情感及行为。其项目包括厌烦的感觉，摔物，争论，直至争斗和不可控制的冲动暴发等各个方面。
 
7. 恐怖(1-5分) phobic: 包括13,25,47,50,70,75和82，共7项。
恐惧的对象包括出门旅行，空旷场地，人群或公共场所和交通工具等。此外，还有反映社交恐怖的一些项目。
 
8. 偏执(1-5分) paranoid: 包括8,18,43,68,76和83,共6项。
本因子是围绕偏执性思维的基本特征而制订的：主要指投射性思维，敌对，猜疑，关系观念，妄想，被动体验和夸大等。
 
9. 精神病性(1-5分) psychoticism: 包括7,16,35,62,77,84,85,87,88和90,共10项。
该因子汇集了一些明显的、纯属精神病性的表现，例如，幻听，思维播散、被控制感、思维被插入。此外，还有一些反映精神分裂样症状的项目。
 
10. 其它(1-5分)
 
计算指标：

1. 总分：90个项目单项分相加之和，能反映其病情严重程度。
2. [不含]总均分：总分/90，表示从总体情况看，该受检者的自我感觉位于1-5级间的的哪一个分值程度上。
3. 阳性项目数：单项分≥2的项目数，表示受检者在多少项目上呈有“病状”。
4. 阴性项目数：单项分=1的项目数，表示受检者“无症状”的项目有多少。
5. 阳性症状均分：（总分－阴性项目数）/阳性项目数，表示受检者在“有症状”项目中的平均得分。反映受检者自我感觉不佳的项目，其严重程度究竟介于哪个范围。


### logic

**admin_table:**

Administrator 只有1个
- register adminUsers
- list adminUsers
- delete adminUsers

adminUser
用户名不许重复。
- list 4 psytest table history.
- calculate psycho data.
- display current psycho test data of users by form.
- display current psycho test data of the crowd by graph.
- *(optional)reset password.*

**user_table:**

User
用户名不许重复。
- init personal information.
- answer 4 psytest papers and commit.
- generate test result.
- list personal commit history.
- *(optional)reset password.*

### API:

#### Admin field

| function | explain | api | method | Status |
| :------ | :------ | :------ | :------: |:------: |
| Login | 登录（发送数据） | localhost:8080/admin/login | post |  done |
| Register | 注册用户 | localhost:8080/admin/register | post |  done |
| isRepeatedName | 是否重名 | localhost:8080/admin/isrepeatname | get/post |  done |
| GetAdminInfo | 获取全部管理人员信息（获取list） | localhost:8080/admin/list | get |  done |
| DeleteAdmin | 删除某个管理人员 | localhost:8080/admin/delete | get |done |

#### Analyze Module(admin field)
分为以下几类：
+ 信度检验
+ 效度检验
+ 卡方检验
+ 数据分类图表显示

#### User field

| function | explain | api | method |Status |
| :------ | :------ | :------ | :------: |:------: |
| Login | 登录（发送数据） | localhost:8080/user/login | post | done |
| Register | 注册（仅跳转页面,vue路由） | localhost:8080/user/register | get | done |
| isRepeatedName | 是否重名 | localhost:8080/user/isrepeatname | get/post |  done |
| GetUserInfo | 获取个人信息（获取表单） | localhost:8080/user/info | get |done |
| GetUserList | 获取全部人员信息（获取list） | localhost:8080/user/list | get |  done |
| UpdateUserInfo | 提交修改信息（提交表单） | localhost:8080/user/update_userinfo | post |done |
| --- | --- | --- | --- | --- |
| CommitPaper_sas | 提交问卷sas | localhost:8080/sas/commit | post |  done |
| CommitPaper_scl90 | 提交问卷scl90 | localhost:8080/scl90/commit | post |done |
| CommitPaper_dass21 | 提交问卷dass21 | localhost:8080/dass21/commit | post | done |
| CommitPaper_novack| 提交问卷novack | localhost:8080/novack/commit | post |done |
| --- | --- | --- | --- | --- |
| list_dass21_history | 查看dass21历史记录 | localhost:8080/dass21/history_list | get |done |
| list_dass21_user_history | 查看个人的dass21历史记录 | localhost:8080/dass21/history_list/user?userid=1 | get |done |
| delete_dass21_user_history | 删除个人的某项dass21历史记录 | localhost:8080/dass21/history_list/delete?id=1 | get |done |
| --- | --- | --- | --- | --- |
| list_sas_history | 查看sas历史记录 | localhost:8080/sas/history_list | get |done |
| list_sas_user_history | 查看个人的sas历史记录 | localhost:8080/sas/history_list/user?userid=1 | get |done |
| delete_sas_user_history | 删除个人的某项sas历史记录 | localhost:8080/sas/history_list/delete?id=1 | get |done |
| --- | --- | --- | --- | --- |
| list_scl90_history | 查看scl90历史记录 | localhost:8080/scl90/history_list | get |done |
| list_scl90_user_history | 查看个人的scl90历史记录 | localhost:8080/scl90/history_list/user?userid=1 | get |done |
| delete_scl90_user_history | 删除个人的某项scl90历史记录 | localhost:8080/scl90/history_list/delete?id=1 | get |done |
| --- | --- | --- | --- | --- |
| list_novack_history | 查看novack历史记录 | localhost:8080/novack/history_list | get |done |
| list_novack_user_history | 查看个人的novack历史记录 | localhost:8080/novack/history_list/user?userid=1 | get |done |
| delete_novack_user_history | 删除个人的某项novack历史记录 | localhost:8080/novack/history_list/delete?id=1 | get |done |


#### CheckResult Module(user field)

+ 数据分类图表显示
+ 历史记录测量心理状态变化

### DB config
```yaml
server:
  port: 8080

spring:
    datasource:
        name: psytest
        url: jdbc:mysql://localhost:3306/psytest?serverTimezone=GMT%2B8&characterEncoding=utf8
        username: root
        password: root
        driver-class-name: com.mysql.cj.jdbc.Driver
    thymeleaf:
      cache: true # 缓存

    devtools:
      restart:
        enabled: true  # 热部署开启
        additional-paths: src/main/java # 监听目录
mybatis:
  mapper-locations: classpath:mapping/*Mapper.xml
  type-aliases-package: com.psytest.myproject
```