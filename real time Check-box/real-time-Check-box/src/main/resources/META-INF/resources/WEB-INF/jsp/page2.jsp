<html>
    <body>
    <h1>Data in Real-time</h1>
        <ul>
            <li th:each="entry : ${formData}">
                <input type="checkbox" checked />
                <span th:text="${entry.key}"></span>
                <!-- Add more styling or formatting as desired -->
            </li>
        </ul>
    </body>
</html>
