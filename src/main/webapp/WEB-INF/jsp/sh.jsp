<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<style>
  .container{
      width:1000px;
      height:auto;
      border:1px #f00 solid;
  }
  #animal-info{
      width:100%;
      height:auto;
      border:1px #000 solid;
      box-sizing: border-box;
  }
  #title{
      width:100%;
  }
  li{width:19%; display: inline-block;}
</style>

<div>
  <header>
    <h1>list</h1>
    <button id="btn">click</button>
  </header>
  <div class="container">
        <div>
            <ul id="title">
                <li>category_seq</li>
                <li>category_name</li>
                <li>regdate</li>
            </ul>
            <ul id="animal-info"></ul>
        </div>
  </div>
</div>


<script src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
  
  $('#btn').click(function(){
    var arr = [];

    $.ajax({
        url : '/curriculum_list_data',
        type: 'POST',
        data: JSON.stringify(arr), // 배열을 제이슨문자열로 변환???
        dataType : 'JSON',
        contentType:"applicariont/json; charset=UTF-8",
        success:function(data){
            //var data = jQuery.parseJSON(response); // 문자열 다시 배열로? 
            //console.log(data);

            $(data).each(function(i,e){ //e는 객체의 오브젝트들
              //animal안의 배열들 (each문은 배열에서 실행됨)

                $('#animal-info').append(
                    "<li>" + data[i]["category_seq"] + "</li>"
                    + "<li>" + data[i]["category_name"] + "</li>"
                    + "<li>" + data[i]["regdate"] + "</li>" + "</br>"
                )
            });

        }
    });
    /*
      .done(function(data){
          //데이터 다운로드가 성공한 경우의 처리

          $(data).each(function(i,e){ //e는 객체의 오브젝트들
              //animal안의 배열들 (each문은 배열에서 실행됨)

                $('#animal-info').append(
                    "<li>" + data[i]['id'] + "</li>"
                    + "<li>" + data[i]['name'] + "</li>"
                    + "<li>" + data[i]['species'] + "</li>"
                    + "<li>" + data[i]['favFood'] + "</li>"
                    + "<li>" + data[i]['favColor'] + "</li>" + "</br>"
                )

            });
          })
          .fail(function(){
              //데이터 다운로드가 실패한 경우의 처리
              window.alert('데이터 불러오기에 실패했습니다.');
          });
      });
    */
  });
</script>
