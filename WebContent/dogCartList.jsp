<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.sun.org.apache.bcel.internal.generic.Select" %>
<%@ page import="vo.Cart" %>
<%@ page import="vo.Dog" %>
<%@ page import="dao.DogDAO" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style type="text/css">

</style>

<script type="text/javascript">



</script>

</head>
<body>
<c:if test="${startMoney != null }">
  <c:set var="startMoney" value="${startMoney}" />
</c:if>

<c:if test="${endMoney != null }">
  <c:set var="endMoney" value="${endMoney}" />
</c:if>

<section id="listForm">
  <c:if test="${cartList != null && cartList.size() > 0 }">
     <h2> 장바구니 목록     </h2>
      <form method="post">
        <table>
            <tr id="select">
               <td colspan="6">
                  <select id="startMoney" name="startMoney">
                     <option>=최저가=</option>
                     <c:choose>
                         <c:when test="${startMoney==1000}">
                            <option selected="selected">1000</option>
                            <option>2000</option>
                            <option>3000</option>
                            <option>4000</option>
                         </c:when>
                         <c:when test="${startMoney==2000}">
                            <option>1000</option>
                            <option selected="selected">2000</option>
                            <option>3000</option>
                            <option>4000</option>
                         </c:when>
                         <c:when test="${startMoney==3000}">
                            <option>1000</option>
                            <option>2000</option>
                            <option selected="selected">3000</option>
                            <option>4000</option>
                         </c:when>
                         <c:when test="${startMoney==4000}">
                            <option>1000</option>
                            <option>2000</option>
                            <option>3000</option>
                            <option selected="selected">4000</option>
                         </c:when>
                         <c:otherwise>
                            <option>1000</option>
                            <option>2000</option>
                            <option>3000</option>
                            <option>4000</option>
                         </c:otherwise>
                      </c:choose>
                  </select>
                  
                  <select id="endMoney" name="endMoney">
                      <option>=최고가=</option>
                      
                      <c:choose>
                          <c:when test="${endMoney==1000}">
                            <option selected="selected">1000</option>
                            <option>2000</option> 
                            <option>3000</option>
                            <option>4000</option>
                          </c:when>
                          <c:when test="${endMoney==2000}">
                            <option>1000</option>
                            <option selected="selected">2000</option> 
                            <option>3000</option>
                            <option>4000</option>
                          </c:when>
                           <c:when test="${endMoney==3000}">
                            <option>1000</option>
                            <option>2000</option> 
                            <option selected="selected">3000</option>
                            <option>4000</option>
                          </c:when>
                          <c:when test="${endMoney==4000}">
                            <option>1000</option>
                            <option>2000</option> 
                            <option>3000</option>
                            <option selected="selected">4000</option>
                          </c:when>
                           <c:otherwise>
                            <option>1000</option>
                            <option>2000</option>
                            <option>3000</option>
                            <option>4000</option>
                         </c:otherwise>
                      </c:choose>
                  </select>
                  <input type="submit" value="검색" formaction="dogCartSearch.dog">
                  </td>
            </tr>
            
            <tr class="tr_top">
                <td>
                 <input type="checkbox" id="allcheck" name="allcheck" onclick="checkAll(this.form)">
                </td>
                <td>번호</td>
                <td>상품 이미지</td>
                <td>상품명</td>
                <td>가격</td>
                <td>수량</td>
            </tr>
            
            <c:forEach var="cart" items="${cartList}" varStatus="status">
              <tr>
               <td>
                 <input type="checkbox" id="remove" name="remove" value="${cart.kind}">
               </td>
               
               <td>
                 ${status.index+1}
               </td>
               
               <td>
                  <img src="images/${cart.image}" id="cartImage">
               </td>
               
               
              
              
              
            
            
            
            
            
            
            
               
              </tr>
            </c:forEach>
            
            
        
        
        
        
        
        </table>
      
      
      
      
      
      
      </form>
  
  
  
  </c:if>





</section>










</body>
</html>
























