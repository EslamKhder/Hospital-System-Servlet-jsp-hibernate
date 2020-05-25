<%-- 
    Document   : AvailablePhysicians
    Created on : May 25, 2020, 11:10:59 PM
    Author     : Eng Eslam khder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Available Physicians</title>
        <style>
            /* Base for label styling */
            [type="checkbox"]:not(:checked),
            [type="checkbox"]:checked {
                position: absolute;
                left: -9999px;
            }
            [type="checkbox"]:not(:checked) + label,
            [type="checkbox"]:checked + label {
                position: relative;
                padding-left: 1.95em;
                margin-left: -34px;
                cursor: pointer;
            }

            /* checkbox aspect */
            [type="checkbox"]:not(:checked) + label:before,
            [type="checkbox"]:checked + label:before {
                content: '';
                position: absolute;
                left: 0; top: 0;
                width: 1.25em; height: 1.25em;
                border: 2px solid #ccc;
                background: #fff;
                border-radius: 4px;
                box-shadow: inset 0 1px 3px rgba(0,0,0,.1);
            }
            /* checked mark aspect */
            [type="checkbox"]:not(:checked) + label:after,
            [type="checkbox"]:checked + label:after {
                content: '\2713\0020';
                position: absolute;
                top: .15em; left: .22em;
                font-size: 1.3em;
                line-height: 0.8;
                color: #09ad7e;
                transition: all .2s;
                font-family: 'Lucida Sans Unicode', 'Arial Unicode MS', Arial;
            }
            /* checked mark aspect changes */
            [type="checkbox"]:not(:checked) + label:after {
                opacity: 0;
                transform: scale(0);
            }
            [type="checkbox"]:checked + label:after {
                opacity: 1;
                transform: scale(1);
            }
            /* disabled checkbox */
            [type="checkbox"]:disabled:not(:checked) + label:before,
            [type="checkbox"]:disabled:checked + label:before {
                box-shadow: none;
                border-color: #bbb;
                background-color: #ddd;
            }
            [type="checkbox"]:disabled:checked + label:after {
                color: #999;
            }
            [type="checkbox"]:disabled + label {
                color: #aaa;
            }
            /* accessibility */
            [type="checkbox"]:checked:focus + label:before,
            [type="checkbox"]:not(:checked):focus + label:before {
                border: 2px dotted blue;
            }

            /* hover style just for information */
            label:hover:before {
                border: 2px solid #4778d9!important;
            }






            /* Useless styles, just for demo design */

            body {
                font-family: "Open sans", "Segoe UI", "Segoe WP", Helvetica, Arial, sans-serif;
                color: #777;
            }
            h1, h2 {
                margin-bottom: .25em;
                font-weight: normal;
                text-align: center;
            }
            h2 {
                margin: .25em 0 2em;
                color: #aaa;
            }
            form {
                width: 7em;
                margin: 0 auto;
            }
            .txtcenter {
                margin-top: 4em;
                font-size: .9em;
                text-align: center;
                color: #aaa;
            }
            .copy {
                margin-top: 2em; 
            }
            .copy a {
                text-decoration: none;
                color: #4778d9;
            }
            .bu1
            {
                margin-left: 529px;
                padding: 10px;
                font-size: 15px;
                border: 1px solid brown;
            }
            .bu2
            {
                margin-left: 62px;
                margin-top: -50px;
                padding: 10px;
                font-size: 15px;
                border: 1px solid brown;
            }
        </style>
    </head>
    <body>
        <h1>Choose Available Physicians</h1>


        <form>
            <p>
                <input type="checkbox" id="test1" value="Eyes Doctor"/>
                <label for="test1">Eyes Doctor</label>
            </p>
            <p>
                <input type="checkbox" id="test2" value="Analysis Doctor"/>
                <label for="test2">Analysis Doctor</label>
            </p>
            <p>
                <input type="checkbox" id="test3" value="Rumor Doctor"/>
                <label for="test3">Rumor Doctor</label>
            </p>
            <p>
                <input type="checkbox" id="test4" value="Pharmacist"/>
                <label for="test4">Pharmacist</label>
            </p>
            <div id="inv"></div>
        </form>
        <button class="bu1" onclick="Done()">Done</button>
        <button class="bu2"><a>Main Page</a></button>
        <script src="js/Available.js"></script>
    </body>
</html>
