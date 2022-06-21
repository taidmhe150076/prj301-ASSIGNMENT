<%-- 
    Document   : group
    Created on : Jun 20, 2022, 12:23:49 AM
    Author     : Tai
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   
        <body>
            
            Campus: <select id="id">
                <option value="first">FU-HL</option>
                <option value="second">FU-HCM</option>
                 <option value="second">FU-ÐN</option>
            </select>
            <br>
            lecturer: <input type="text" name="name">
            <input type="button" value="View">
            <table border="1px">
                <tr>
                    <td>Year <select>
                            <option value="value">2021</option> 
                            <option value="value">2022</option>
                            <option value="value">2023</option>
                        </select> 
                    </td> 
                    <td>Mon</td>
                    <td>TUE</td>
                    <td>WED</td> 
                    <td>THU</td>
                    <td>FRI</td>
                    <td>SAT</td>
                    <td>SUN</td>
                </tr>
                 <tr>
                
                    <td>Week <select>
                            <option value="value">17-1to23-1</option> 
                            <option value="value">2022</option>
                            <option value="value">2023</option>
                        </select> 
                    </td> 
                    <td></td>
                    <td></td>
                    <td></td> 
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <c:forEach items="${requestScope.groups}" var="g">
                <tr>
                    <td>Slot1</td> 
                    <td> ${g.GroupID}</td>
                    <td>
                       PRF192 <br> 
                        at BE-301
                    </td>
                    <td></td> 
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
               </c:forEach>
                 <tr>
                    <td>Slot2</td> 
                    <td>IOT1702-PRF192 <br> 
                        at BE-301 </td>
                    <td></td>
                    <td></td> 
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                 <tr>
                    <td>Slot3</td> 
                    <td></td>
                    <td></td>
                    <td>OT1702-PRF192 <br> 
                        at BE-301</td> 
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                 <tr>
                    <td>Slot4</td> 
                    <td></td>
                    <td></td>
                    <td></td> 
                    <td>OT1702-PRF192 <br> 
                        at BE-301</td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                 <tr>
                    <td>Slot5</td> 
                    <td></td>
                    <td></td>
                    <td></td> 
                    <td></td>
                    <td>OT1702-PRF192 <br> 
                        at BE-301</td>
                    <td></td>
                    <td></td>
                </tr> <tr>
                    <td>Slot6</td> 
                    <td></td>
                    <td></td>
                    <td></td> 
                    <td></td>
                    <td></td>
                    <td>OT1702-PRF192 <br> 
                        at BE-301</td>
                    <td></td>
                </tr>

                
            
            
            
            
            
        </form>
    </body>
    
</html>
