##### 本项目为毕设自用。
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
         11 >500M 超级大富豪5000万以上
         10 100M-500M 超级富豪1000万~5000万
         9 30M-100M 大富豪300万~1000万
         8 50K-30M 富豪50万~300万
         7 300K-500K 高产者30万~50万
         6 150K-300K 中产者15万~30万
         5 80K-150K 低产者8万~15万
         4 30K-80K 穷人3万~8万
         3 10K-30K 很穷的人1万~3万
         2 5K-10K 非常穷的人5000~1万
         1 <5K 最穷的人5000元以下
         数据来自中国贫富标准
 - "marriage":0 是否已婚，1已婚0未婚。

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

Admin field

| function | explain | api | method | Status |
| :------ | :------ | :------ | :------: |:------: |
| Login | 登录（发送数据） | localhost:8080/admin/login | post |  done |
| Register | 注册用户 | localhost:8080/admin/register | post |  done |
| isRepeatedName | 是否重名 | localhost:8080/admin/isrepeatname | get/post |  done |
| GetAdminInfo | 获取全部管理人员信息（获取list） | localhost:8080/admin/list | get |  done |
| DeleteAdmin | 删除某个管理人员 | localhost:8080/admin/delete | get |done |

Analyze Module(admin field)


User field

| function | explain | api | method |Status |
| :------ | :------ | :------ | :------: |:------: |
| Login | 登录（发送数据） | localhost:8080/user/login | post | done |
| Register | 注册（仅跳转页面,vue路由） | localhost:8080/user/register | get | done |
| isRepeatedName | 是否重名 | localhost:8080/user/isrepeatname | get/post |  done |
| GetUserInfo | 获取个人信息（获取表单） | localhost:8080/user/get_userinfo | get |done |
| UpdateUserInfo | 提交修改信息（提交表单） | localhost:8080/user/update_userinfo | post |done |
| CommitPaper_sas | 提交问卷sas | localhost:8080/user/sas | post |
| CommitPaper_scl90 | 提交问卷scl90 | localhost:8080/user/scl90 | post |
| CommitPaper_dass21 | 提交问卷dass21 | localhost:8080/user/dass21 | post |
| CommitPaper_holander | 提交问卷holander | localhost:8080/user/holander | post |

CheckResult Module(user field)


