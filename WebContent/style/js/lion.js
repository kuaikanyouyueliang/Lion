/**页面默认加载datepicker控件
 * 默认加载函数reloadDatepicker_1();
 */
$(function(){
	reloadDatepicker_1();
});
/**根据日期字符串取得其时间*/
function getTimeByDateStr(dateStr){  
    var year = parseInt(dateStr.substring(0,4));  
    var month = parseInt(dateStr.substring(5,7),10)-1;  
    var day = parseInt(dateStr.substring(8,10),10);  
    return new Date(year, month, day).getTime();  
}
/**控制日期选择在3天以内*/
function reloadDatepicker_0(){
	var datepickers=$("#startDate,#endDate");
	datepickers.datepicker({
		onSelect:function(dateText,inst){
			if(this.id=="startDate"){
				var minDate=new Date(getTimeByDateStr(dateText));
				var maxDate=new Date(getTimeByDateStr(dateText)+2*24*60*60*1000);
				datepickers.not(this).datepicker("option","minDate",minDate);
				datepickers.not(this).datepicker("option","maxDate",maxDate);
			}else if(this.id="endDate"){
				var maxDate=new Date(getTimeByDateStr(dateText));
				var minDate=new Date(getTimeByDateStr(dateText)-2*24*60*60*1000);
				datepickers.not(this).datepicker("option","minDate",minDate);
				datepickers.not(this).datepicker("option","maxDate",maxDate);
			}
		},
	});
}
/**控制endDate不能大于starDate*/
function reloadDatepicker_1(){
	var datepickers=$("#startDate,#endDate");
	datepickers.datepicker({
		onSelect:function(dateText,inst){
			if(this.id=="startDate"){
				var minDate=new Date(getTimeByDateStr(dateText));
				datepickers.not(this).datepicker("option","minDate",minDate);
			}else if(this.id="endDate"){
				var maxDate=new Date(getTimeByDateStr(dateText));
				datepickers.not(this).datepicker("option","maxDate",maxDate);
			}
		},
	});
}