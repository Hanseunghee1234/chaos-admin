<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script src="/ckeditor/ckeditor.js"></script>
<script src="http://code.jquery.com/jquery-latest.js"></script>
/*<script>
  function check() {
    var str = document.getElementById('editor_title');
    var str2 = document.getElementById('editor_contents');

    if(str.value == '' || str.value == null){
      alert('제목 입력하셈');
      return false;
    }
    if(str2.value == '' || str2.value == null){
      alert('내용 입력해');
      return false;
    }
    return save();

  }
  function save(){
    var str3 = document.getElementById('writer');
    str3.submit();
  }
</script>*/
<style>
  header{
      background-color: #000;
      padding:20px 0 20px 20px;
  }
  header .hd_wh{
      color:#fff;
      font-weight: bold;
  }
</style>

<div>
  <header>
    <span class="hd_wh">YazaNamoo 글쓰기</span>
    </header>
    <form id="writer" action="/write.do" method="post">
      <p>
          <textarea name="editor1" id="editor1" rows="10" cols="80">
              This is my textarea to be replaced with CKEditor.
          </textarea>
          <script>
              // Replace the <textarea id="editor1"> with a CKEditor
              // instance, using default configuration.
              CKEDITOR.replace( 'editor1' );
              // $('#cke_editor1').css('margin','0 auto !important');
          </script>
      </p>
      <p>
          <input type="submit" name="write" id="save" value="저장" />
          <input type="button" name="" value="취소">
      </p>
    
    </form>
</div>

