<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>灵动创新 - 定期沟通</title>
		<link rel="stylesheet" href="../js/libs/bootstrap/3.3.1/css/bootstrap.min.css">
		<link rel="stylesheet" href="../js/libs/bootstrap-switch/3.3.0/css/bootstrap3/bootstrap-switch.min.css">
		<link rel="stylesheet" href="../js/libs/iCheck/1.0.2/skins/all.css">
		<link rel="stylesheet" href="../css/unimarketing.css">
		<link rel="stylesheet" href="../css/unimail.css">
		<script src="../js/libs/jquery-1.11.0.min.js"></script>
		<script src="../js/libs/bootstrap/3.3.1/js/bootstrap.min.js"></script>
		<script src="../js/libs/bootstrap-switch/3.3.0/js/bootstrap-switch.min.js"></script>
		<script src="../js/libs/iCheck/1.0.2/icheck.min.js"></script>
		<!--[if lt IE 9]>
			<script src="../js/libs/html5shiv/3.7.2/html5shiv.min.js"></script>
			<script src="../js/libs/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
		<script src="../js/function.js"></script>
		<script src="../js/unimail.js"></script>
		<script>
		$(function() {
			$('input.radio, input.checkbox').iCheck({
				checkboxClass: 'icheckbox_square-blue',
				radioClass: 'iradio_square-blue'
			});
		});
		</script>
	</head>
	<body>
		<table width="100%" height="100%">
			<tr>
				<td id="container-header" colspan="2" height="125" valign="top">
					<table width="100%">
						<tr>
							<td width="12%" style="background-image:url(../images/topBg.gif); background-repeat:repeat-x"></td>
							<td width="88%" height="6" style="background-image:url(../images/topBg.gif); background-repeat:repeat-x"></td>
						</tr>
					</table>
					<table width="100%">
						<tr>
							<td width="20%" valign="middle">
								<a href="http://www.unimarketing.com.cn/" target="_blank">
								<img src="../images/unimailLogo.gif" width="153" height="57" border='0'></a>
							</td>
							<td width="20%" valign="top" align="right">
								<table width="400">
									<tr>
										<td width="240" class="font_txt02" align="right">
											欢迎 admin
										</td>
                                        <td width="20"><img src="../images/header_devide.gif" width="22" height="23"></td>
										<td width="80" class="font_txt03" align="center">
											<a href="/account.do?method=view" class="link2">帮助中心</a>
										</td>
										<td width="20"><img src="../images/header_devide.gif" width="22" height="23"></td>
										<td width="80" class="font_txt03" align="center">
											<a href="/account.do?method=view" class="link2">账户信息</a>
										</td>
										<td width="20"><img src="../images/header_devide.gif" width="22" height="23"></td>
										<td width="40" class="font_txt03" align="center">
											<a href="/login.do?method=logoff" class="link2">注销</a>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
					<table width="100%">
						<tr>
							<td>
								<table width="100%" height="31" style="background-image:url(../images/navtop_Bg.gif); background-repeat:repeat-x; margin:0">
									<tr>
										<td width="45">&nbsp;</td>
										<td width="114" align="center" valign="middle" class="font_menu"
											onmouseover="activeMenu('dashboardImage','../images/but_index02.gif')"
											onmouseout="deactiveMenu('dashboardImage','../images/but_index01.gif')">
											<a href="dashboard.html" class="linkMenu">
											<img id="dashboardImage" src="../images/but_index01.gif" border="0"></a>
										</td>
										<td width="113" align="center" valign="middle" class="font_menu">
											<a href="automation.html" class="linkMenu">
											<img id="contactsImage" src="../images/but_index_auto02.png" border="0"></a>
										</td>
										<td width="113" align="center" valign="middle" class="font_menu"
											onmouseover="activeMenu('reportGroupsImage','../images/but_reportGroups02.gif')"
											onmouseout="deactiveMenu('reportGroupsImage','../images/but_reportGroups01.gif')">
											<a href="report.html" class="linkMenu">
											<img id="reportGroupsImage" src="../images/but_reportGroups01.gif" border="0"></a>
										</td>
										<td width="113" align="center" valign="middle" class="font_menu"
											onmouseover="activeMenu('messageImage','../images/but_index_profile02.png')"
											onmouseout="deactiveMenu('messageImage','../images/but_index_profile01.png')">
											<a href="profile.html" class="linkMenu">
											<img id="messageImage" src="../images/but_index_profile01.png" border="0"></a>
										</td>
										<td align="right" nowrap="nowrap" id="customerServices" style="padding-right: 5px">
											<table width="100%">
												<tr>
													<td align="right" nowrap="nowrap"><font style="font-family:Arial; font-weight:bold; font-size:12px;">支持电话: 400-898-0118</font></td>
													<td width="100">
														<script type="text/javascript" src="http://static.b.qq.com/account/bizqq/js/wpa.js?type=1&kfuin=4008980118&ws=www.unimarketing.com.cn&btn1=%E5%9C%A8%E7%BA%BF%E5%92%A8%E8%AF%A2"></script>
													</td>
												</tr>
											</table>
										</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td colspan="6" height="7" style="background-image:url(../images/divideLine.gif); background-repeat:repeat-x"></td>
						</tr>
						<tr>
							<td height="26" colspan="6" valign="middle">
								<table width="100%" height="26" style="background-color: #e2e2e2; font-size:12px; color:#3f3f3f">
									<tr>
										<td width="45">&nbsp;</td>
										<td width="100" align="center">
											<a href="automation.html" class="link4">
												<img src="../images/but_indsub_first01.png" border="0" align="absmiddle">
											</a>
										</td>
										<td width="100" align="right">
											<a href="automation_auto.html" class="link4">
												<img src="../images/but_indsub_auto02.png" border="0" align="absmiddle"/>
											</a>
										</td>
										<td>&nbsp;</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
		<table width="100%" height="100%">
			<tr>
				<td class="main_title font_title04">
					定期沟通
				</td>
			</tr>
			<tr>
				<td height="10"></td>
			</tr>
		</table>
		<div class="container font_txt02">
			<div class="row">
				<span class="col-md-6">
					<div class="row">
						<span class="col-md-12">
							营销状态：<input id="switch-state" type="checkbox">
							&nbsp;&nbsp;&nbsp;
							营销周期：
							<input type="radio" class="radio" id="radio1" name="radio"><label for="radio1">&nbsp;周刊</label>&nbsp;
							<input type="radio" class="radio" id="radio2" name="radio" checked="checked"><label for="radio2">&nbsp;双周刊</label>&nbsp;
							<input type="radio" class="radio" id="radio3" name="radio"><label for="radio3">&nbsp;月刊</label>
						</span>
					</div>
					<div class="row">
						<span class="col-md-12">
							最后更新时间：2014-12-12 08:34:23
						</span>
					</div>
				</span>
				<span class="col-md-6">
					<div class="row">
						<span class="col-md-6">
							过去30天
						</span>
						<span class="col-md-6" align="right">
							<a href="javascript:void(0);">查看详细报表 >></a>
						</span>
					</div>
					<div class="row">
						<span class="col-md-12">
							<table width="100%" class="table table-hover">
								<thead>
									<tr>
										<th>成交量</th>
										<th>成交额</th>
										<th>营销成本</th>
										<th>ROI</th>
										<th>邮件发送量</th>
										<th>短信发送量</th>
										<th>邮件打开率</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>20</td>
										<td>200</td>
										<td>0</td>
										<td>1:500</td>
										<td>200</td>
										<td>50</td>
										<td>30%</td>
									</tr>
								</tbody>
							</table>
						</span>
					</div>
				</span>
			</div>
			<div class="row">
                <span class="col-md-12">
                    <ul class="nav nav-tabs">
                        <li class="active"><a href="#tabMailContent" data-toggle="tab">Step1: 编辑营销内容</a></li>
                        <li><a href="#tabWho" data-toggle="tab">Step2: 优化营销对象</a></li>
                    </ul>
                </span>
            </div>
            <div class="row">
                <span class="col-md-12">
				<div class="tab-content">
					<div class="well tab-pane active" id="tabMailContent">
						<div class="row">
							<span class="col-md-12">
								<table width="100%">
									<tr>
										<td width="30%" align="right">
											默认邮件主题: 
										</td>
										<td width="35%" style="padding: 5px;">
											<span id="subjectEdit" style="display: none;">
				                                <input class="font_txt02"
				                                   style="front-size: 11px; border: 1px solid #9D9D9D"
				                                   maxlength="200" size="60" 
				                                   name="subject" id="subject"
				                                   value="subject subject subject subject subject subject subject subject subject subject subject subject ">
				                                <a href="javascript:openDIV('subject')"><img border="0" align="absmiddle" src="../images/icon_personalize.png" title="个性化主题"></a>
				                                &nbsp;&nbsp;
				                            </span>
				                            <span id="subjectShow">
				                            	subject subject subject subject subject subject subject subject subject subject subject subject 
				                            </span>
										</td>
										<td width="35%">
											<button type="button" id="btnSubjSave" class="btn btn-sm btn-primary" style="display: none;">保存</button>
											<button type="button" id="btnSubjCancel" class="btn btn-sm btn-default" style="display: none;">取消</button>
											<button type="button" id="btnSubjEdit" class="btn btn-sm btn-link">编辑</button>
											<button type="button" id="btnTimeSubjCreate" class="btn btn-sm btn-link">新建定时主题</button>
										</td>
									</tr>
									<tr id="trTimeSubj" style="display: none">
										<td width="30%" align="right">
											定时主题: 
										</td>
										<td width="35%" style="padding: 5px;">
											<span id="timeSubjEdit" style="display: none;">
				                                <input class="font_txt02"
				                                   style="front-size: 11px; border: 1px solid #9D9D9D; margin-bottom: 3px;"
				                                   maxlength="200" size="60" 
				                                   name="timeSubject" id="timeSubject"
				                                   value="定时主题">
				                                <a href="javascript:openDIV('subject')"><img border="0" align="absmiddle" src="../images/icon_personalize.png" title="个性化主题"></a>
				                                <br>
				                                <input type="text" value="2015-01-08 12:00"> - <input type="text" value="2015-01-10 12:00">
				                            </span>
				                            <span id="timeSubjShow">
				                            	定时主题 
				                            </span>
										</td>
										<td width="35%">
											<button type="button" id="btnTimeSubjSave" class="btn btn-sm btn-primary" style="display: none;">保存</button>
											<button type="button" id="btnTimeSubjCancel" class="btn btn-sm btn-default" style="display: none;">取消</button>
											<button type="button" id="btnTimeSubjEdit" class="btn btn-sm btn-link">编辑</button>
											<button type="button" id="btnTimeSubjDelete" class="btn btn-sm btn-link">删除</button>
										</td>
									</tr>
								</table>
								<script>
								function showSubjEdit() {
									$("#btnSubjEdit").hide();
									$("#subjectShow").hide();
									$("#btnSubSjCreate").hide();
									$("#subjectEdit").show();
									$("#btnSubjSave").show();
									$("#btnSubjCancel").show();
								}
								function hideSubjEdit() {
									$("#btnSubjEdit").show();
									$("#subjectShow").show();
									$("#btnSubSubjCreate").show();
									$("#subjectEdit").hide();
									$("#btnSubjSave").hide();
									$("#btnSubjCancel").hide();
								}
								function showTimeSubjEdit() {
									$("#timeSubjEdit").show();
									$("#timeSubjShow").hide();
									$("#btnTimeSubjEdit").hide();
									$("#btnTimeSubjSave").show();
									$("#btnTimeSubjCancel").show();
								}
								function hideTimeSubjEdit() {
									$("#timeSubjEdit").hide();
									$("#timeSubjShow").show();
									$("#btnTimeSubjEdit").show();
									$("#btnTimeSubjSave").hide();
									$("#btnTimeSubjCancel").hide();
								}
								$("#btnSubjEdit").on("click", function() {
									showSubjEdit();
								});
								$("#btnSubjSave").on("click", function() {
									hideSubjEdit();
								});
								$("#btnSubjCancel").on("click", function() {
									hideSubjEdit();
								});
								$("#btnTimeSubjCreate").on("click", function() {
									$("#btnTimeSubjCreate").hide();
									$("#trTimeSubj").show();
									showTimeSubjEdit();
								})
								$("#btnTimeSubjSave").on("click", function() {
									hideTimeSubjEdit();
								});
								$("#btnTimeSubjCancel").on("click", function() {
									hideTimeSubjEdit();
								});
								$("#btnTimeSubjEdit").on("click", function() {
									showTimeSubjEdit();
								});
								$("#btnTimeSubjDelete").on("click", function() {
									$("#btnTimeSubjCreate").show();
									$("#trTimeSubj").hide();
								});
								</script>
							</span>
						</div>
						<br>
						<div class="row">
							<span class="col-md-12" style="text-align: center">
								<button type="button" id="btnMailPreview" class="btn btn-sm btn-primary">预览</button>
								<button type="button" id="btnMailEdit" class="btn btn-sm btn-primary">编辑</button>
							</span>
						</div>
						<br>
						<div class="row">
							<span class="col-md-12">
								<div id="divMailContent" style="clear:both; border: solid 1px #ccc; text-align: center">
									<!-- mail content begin -->
									<iframe style="border: none" id="ifmMail" src="mail.html" width="960" height="600"></iframe>
									<script>
									$("#ifmMail").load(function() {
										var mainheight = $(this).contents().find("body").height() + 30;
										$(this).height(mainheight);
									});
									</script>
									<!-- mail content end -->
								</div>
							</span>
						</div>
					</div>
					<div class="well tab-pane" id="tabWho">
						<div class="row">
							<span class="col-md-12">
								<ul>
									<li>订单交易情况
										<ul>
											<li>过去 <a href ="javascript:void(0);">7</a> 天无新成交订单（避免过度透支高复购客户的消费能力，才让忠诚度良性发展）</li>
											<li>没有 <a href ="javascript:void(0);">中差评</a> 的会员 （给满意度较高的会员发送，更能提高成交效果）</li>
										</ul>
									</li>
									<li>邮件反馈情况
										<ul>
											<li>过去连续 <a href ="javascript:void(0);">7</a> 封邮件至少打开过一次（打开过邮件的会员比从未打开过的会员更加活跃，更容易产生积极的反馈）</li>
											<li>过去连续 <a href ="javascript:void(0);">5</a> 封邮件至少成功送达一次（连续多次弹回的邮件能再次送达的概率极低，放弃这些，可以降低营销成本、提高送达率）</li>
										</ul>
									</li>
								</ul>
							</span>
						</div>
						<div class="row">
							<span class="col-md-12">
								<input type="button" class="btn btn-primary" value="保存">&nbsp;
								<input type="button" class="btn" value="取消">
							</span>
						</div>
					</div>
				</div>
                </span>
			</div>
		</div>
		<table width="98%">
			<tr>
				<td width="2%" height="30">
					<img src="../images/ablank04.gif" width="22" height="12">
				</td>
				<td width="98%">&nbsp;</td>
			</tr>
			<tr>
				<td height="1"></td>
				<td height="1">
					<img name="bottom" src="" width="100%" height="1" title="" style="background-color: #dedede">
				</td>
			</tr>
			<tr>
				<td>
					<img src="../images/ablank04.gif" width="22" height="20">
				</td>
				<td class="font_copyright">
					<img src="../images/c.gif" width="8" height="8">
					Copyright 2006-2014  Unisoftware Unimail, Inc. All rights reserved.
				</td>
			</tr>
		</table>
		<script>
		$("#switch-state").bootstrapSwitch();
		</script>
	</body>
</html>