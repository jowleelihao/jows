// 用户名可以包含数字、下划线、数字和汉字，长度为6-18，并且提示用户
// 密码只能包含字母、数字和下划线，长度为8-16位并且提示用户
// 确认密码若不一致则提示用户
// 电话号码为11位并且提示用户
// 国籍为选择型不为输入型、生日为选择型；
//           喜好为选择型、可多选,设置全选与反选功能
// 加入注册按钮。若成功，则转到成功界面。若上述有不符合要求的任何一项、将不实现跳转；
    $( function () {
        /*
   通过正则表达式验证用户名并提示
    */
    	  var  yearList=$("#yearList");
          var monthList=$("#monthList");
          for(var i=1900;i<=2021;i++){
              $("<option>"+i+"</option>").appendTo(yearList);
          }//增加年份的option
          for (var i=1;i<=12;i++){
              $("<option>"+i+"</option>").appendTo(monthList);
          }              //增加月份的option
          var dayList = $("#dayList");
          dayList.click(function (){
              var vYear=parseInt(yearList.val());
              var vMonth=parseInt(monthList.val());
              var max = (new Date(vYear,vMonth, 0)).getDate();//获取对应年份月份的天数
              if($("#dayList option").length!=(max+1)){
              for (var i=1; i <= max; i++) {
                  $("<option>"+i+"</option>").appendTo(dayList);
              }
              }
          });//点击日期选择后执行增加日期的option
          dayList.blur(function () {

              monthList.change(function () {
                  $("#dayList option").remove();
                  $("<option>---请选择日期---</option>").appendTo(dayList);
              });
              yearList.change(function (){
                  $("#dayList option").remove();
                  $("<option>---请选择日期---</option>").appendTo(dayList);
              });
          });//用户选择好日期后，若更换年份或月份，重置dayList，并重新点击时又会触发上面的点击函数
        $("#turnin").click(function () {
        	

        	 var userName=$("#userName");
             var patt1=/^\w{6,18}$/;//正则表达式的数字字母和下划线，^表示开头包含，$表示结尾包含，{6，18}表示6-18位
             if(!patt1.test(userName.val())){
             	$("#useNameSpan").html("用户名不合法,请输入6-18位数字、字母或下划线");
             	return false;
             }
             else{
            	 $("#useNameSpan").html("");
             }
             //验证密码合法性
             let password1=$("#password1");
             let password2=$("#password2");
             var patt2=/^\w{8,16}$/;
             if (!patt2.test(password1.val())){
                 $("#password1Span").html("密码不可用");
                 return false;
             }
             else {
            	 $("#password1Span").html("");
			}
             if (!(password1.val()==password2.val())){
                 $("#password2Span").html("两次输入的密码不一致");
                 return false;
             }
             else {
            	 $("#password2Span").html("");
			}
             //验证电话的合法性
             let phone=$("#phone");
             var patt3=/^1[0-9]{10}$/;
             if(!patt3.test(phone.val())){
                 $("#phoneSpan").html("电话号码不可用");
                 return false;
             }
             else{
            	 $("#phoneSpan").html("");
             }
             if(($("#yearList").val()=="---请选择年份---")||($("#monthList").val()=="---请选择月份---")||($("#monthList").val()=="---请选择月份---")){
            	 $("#birthSpan").html("请选择生日");
            	 return false;
             }
             else {
            	 $("#birthSpan").html("");
			}
             
             if($("#email").val()==""){
            	 $("#emailSpan").html("请输入邮箱");
            	 return false;
             }
             else{
            	 $("#emailSpan").html("");
             }
//            let sex=document.getElementByName("sex");
//            if(sex[0].checked==false&&sex[1].cheked==false){
//            	$("#sexSpan").html("请选择性别");
//            	return false;
//            }
//            else {
//            	$("#sexSpan").html("");
//			}
             
        });
        
    });





