<script src="http://code.jquery.com/jquery-latest.js"></script>
  $('#btn').click(function(){

    var arr = [{"a":1, "b":2}, {"a":2, "b":4}];
    
        $.ajax({
            url : '/curriculum_list_data',
            type: 'POST',
            data: JSON.stringify(arr),
            dataType : 'JSON',
            contentType:"applicariont/json; charset=UTF-8",
            success:function(response){
                //var data = jQuery.parseJSON(response);
                console.log(data);
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
