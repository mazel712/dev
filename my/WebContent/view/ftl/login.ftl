<html>
<#--自定义变量-->  
<#assign num='hehe'/>  
${num}  
<#--自定义标签 --> 
  <@content name="chenghui" age="120">  
    ${output}  
    ${append}  
  </@content>  
</html>