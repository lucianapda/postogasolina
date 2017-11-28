<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

</head>

<body>
<script type="text/javascript">
 
(function($) {
    var infoModal = $('#myModal');
    $('.thumbnail').on('click', function(){
        $.ajax({ 
          type: "GET", 
          url: 'getJson.php?id='+$(this).data('id'),
          dataType: 'json',
          success: function(data){ 
            htmlData = '<ul><li>title: '+data.first_name+'</li><li>age: '+data.age+'</li></ul>';
            infoModal.find('.modal-body').html(htmlData);
            modal.modal('show');
          }
        });

        return false;
    });
})(jQuery);
</script>

<ul>
    <li class="project span3" data-type="pfa">
    <a href="#" data-id="2" class="thumbnail">
        <img src="images/new.png" alt="Kenneth Atkins" />
        <h1>Kenneth Atkins</h1>
        <p>[Description here]</p>
    </a>     
    </li>
</ul>


</body>
</html>