package com.pageItems;

public class PageXpath {
	
	public static final String URL="https://www.tmall.com/";
	
	
	//首页
	public static final String REGISTER="//a[@class='sn-register']";
	public static final String Login="//a[contains(text(),'请登录')]";
	public static final String SEARCH="//input[@id='mq']";
	public static final String SEARCH_BUTTON="//button[@type='submit']";
	public static final String HOT_TAB="//ul[@class='hot-query']/li[4]";//第四个热标签
	public static final String TIANMAO_MARCKET="//a[@aria-label='天猫超市']";
	public static final String LIFT_NAVIGATION="//ul[@class='normal-nav clearfix']/li[9]/a";//生鲜水果
	public static final String RIGHT_NAVIGATION="//div[@class='mui-mbar-tab-logo mui-mbar-tab-logo-prof']";//会员权益
	public static final String SECOND_FLOOR="//span[contains(text(),'潮流前沿')]";//会员权益
	
	
	//frame
	public static final String J_Member="J_Member";
	public static final String J_LOGIN="J_loginIframe";
	
	//注册页
	public static final String AGREEMENT="//button[@id='J_AgreementBtn']";//J_Member.reglframe
	public static final String MOBILE="//input[@id='J_Mobile']";//J_Member.reglframe
	public static final String HUAKUAI="//span[@id='nc_1_n1z']";//J_Member.reglframe
	public static final String NEXT="//button[@id='J_BtnMobileForm']";//J_Member.reglframe
	public static final String CHANGE="//div[contains(text(),'此手机号码绑定的帐户数已达上限，请更换')]";//J_Member.reglframe
	
	//登陆页
	public static final String LOGIN_BYPWD="//a[contains(text(),'密码登录')]";//J_loginIframe
	public static final String USER_NAME="//input[@id='TPL_username_1']";//J_loginIframe
	public static final String PWD="//input[@id='TPL_password_1']";//J_loginIframe
	public static final String LOGIN_BUTTON="//button[@id='J_SubmitStatic']";//J_loginIframe
	public static final String POINT="//div[@class='poptip-content']";//J_loginIframe
	public static final String ERROR="//p[@class='error']";//J_loginIframe
	//搜索第一个商品
	public static final String FIRST_GOODS="//a[@data-p='1-11']";
	public static final String FIRST_SHOP="//div[@data-atp='b!1-3,{user_id},,,,,,']/a";
	public static final String SALES="//div[@data-atp='b!1-3,{user_id},,,,,,']/following-sibling::p/span/em";
	
	//HotTab页面
	public static final String KEYTAB="//ul[@class='relKeyTop']/li[3]";//第三个keyTab
	public static final String SEARCH_SALES="//div[@id='J_Filter']/a[4]";//选择按销量排序
	public static final String HOT="//div[@id='J_Filter']/a[2]";//选择按人气排序
	
	
	//天猫超市页
	public static final String ADDRESS="//div[@id='J_AreaSelector']";
	public static final String BEIJING="//p[@class='hot-cities']/span[@index='6']";
	public static final String SEARCH_TM="//input[@id='mq']";
	public static final String SUBMIT="//button[@type='submit']";
	public static final String BRAND="//a[@pos='5']";//第五个品牌
	public static final String SALES_TM="//ul[@class='filter-sort']//span[contains(text(),'总销量')]";
	public static final String FIRST_TITLE="//ul[@id='J_ProductList']/li[1]//h3";
	public static final String FIRST_PRICE="//ul[@id='J_ProductList']/li[1]//span[@class='ui-price']";
	
	//左导航栏
	public static final String SANWENYU="//div[@class='content-con j_categoryContent']/div[9]/div/div/div[5]/div[2]/a[2]";//三文鱼
	public static final String FIRST_BRANCH="//ul[@class='av-collapse row-2']/li[1]/a";//第一个品牌
	public static final String LOCAL="//div[contains(text(),'产地')]/following-sibling::div[1]/ul/li[2]/a";//产地 丹麦
	
	//喵生鲜页面
	public static final String FRUITS="//ul[@class='navItemWrapper J_navItemWrapper clearfix']/li[2]/a";
	public static final String M_TITLE="//div[@class='mxs-style-items-content clearfix']/div[1]/div[2]/div[1]";
	public static final String M_PRICES="//div[@class='mxs-style-items-content clearfix']/div[1]/div[2]/div[4]//div[@class='mui-price']";
	
	//Second_Floor
	public static final String SECOND_BRANCH="//div[contains(text(),'品牌精选新品')]";
	public static final String SECOND_FIRST_SHOP="//div[@id='J_7939264490']//ul[@class='items']/li[1]";
	
	
}
