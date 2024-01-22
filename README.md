# GDW Projekt 

# Szenario 
Lana sitzt abends zu Hause und möchte einen Film ansehen. Nach langem Scrollen durch verschiedene Streaming-Dienste, hat sie aber nichts gefunden, worauf sie Lust hat. Alle Filme die zu ihrem Lieblingsgenre vorgeschlagen werden, kennt sie schon. Und statt weitere Filme aus diesem Genre zu sehen, würde sie gerne mal eine neue Filmrichtung ausprobieren. Also sucht sie im Internet nach einer Webseite, die ihr Filmempfehlungen auflistet. Dort kann sie nach bestimmten Kategorien filtern, aber die Auswahl ist immer noch zu groß und zu unübersichtlich. Als Lana dann einen Film, der sie anspricht, gefunden hat, bemerkt sie, dass der Film auf keinem ihrer abonnierten Streaming-Dienste verfügbar ist. 

Zusätzlich möchte Lana Benachrichtungen über neue Filme in ihrer bevorzugten Kategorie erhalten. Hierzu nutzt sie eine Push-API und erhält Benachrichtungen, wenn ein neuer Film verfügbar ist.

# Projektdokumentation 
In diesem Projekt im Modul Grundlagen des Web im Wintersemester 2023/24 war das Ziel eine Web-Anwendung zu entwickeln, die die Funktionen einer Filmempfehlungsseite abdeckt, indem sie Benutzer*Innen die Möglichkeit bietet Filme nach z.B. Genres, Altersbeschränkung, etc. zu filtern und Filme zu favorisieren.

Die Idee der Push-Benachrichtigungen haben wir verworfen, weil zum einen die notwendige API nicht eingebunden werden konnte und zum anderen die Komplexität des Projekts durch dieses Feature viel zu sehr erhöht worden wäre.

Im Projektverlauf wurden weitere Entscheidungen getroffen, um zeitliche Einschränkungen und mangelnde Ressource zu berücksichtigen. Die Integration von Informationen zur Verfügbarkeit auf bestimmten Streaming-Diensten wurde ebenfalls aus Zeitgründen verworfen, da keine geeignete Schnittstelle oder Quellen für diese Daten verfügbar waren.

Ein zusätzliches Problem bestand darin, Informationen wie “Wann kommt der nächste MCU-Film?” erfolgreich in das Hauptprogramm einzubinden. Trotz wiederholter Versuche konnte die MCU-API leider nicht sinnvoll integriert werden. Dennoch erhalten wir, indem sie in der Hauptausgabe angezeigt wird, die Informationen über den bevorstehenden MCU-Film. 

Eine dritte Ressource, neben User und Movie, basierend auf unserem Domänenmodell zu finden, hat uns längere Zeit Schwierigkeiten bereitet, da die Projektidee auf der Suche der Benutzer*Innen nach Filmen basiert, also sich auf die Beziehung im Domänenmodell zwischen User und Movie beschränkt. Schlussendlich haben wir uns für FavoriteMovie entschieden, da diese favorisierten Filme durch den jeweiligen Nutzer ausgewählt bzw. erstellt werden und in den Kontext passen.

Es war hilfreich, dass die Grundstruktur des IntelliJ-Projektes im Workshop erarbeitet wurde. Aber über die Grundstruktur hinaus, konnte man sich an dem Beispiel der ToDo-Liste nicht weiter orientieren und musste sich anderweitig Hilfe suchen (z.B. Spring Boot Tutorials), da die Vorlesung wenige Code-Beispiele liefert.

Für das Deployment unseres Projekts haben wir das bereitgestellte Deployment-Tool auf GitHub Azure verwendet. Die Einbindung verlief vergleichsweise einfach und beanspruchte nicht viel Zeit. Allerdings gestaltete sich die Fehlersuche als herausfordernd, da zusätzlich zu diesem Problem auch Schwierigkeiten auftraten, die das gelegentliche Fehlschlagen der Anwendung betrafen. Hierbei war nicht klar ersichtlich, wo genau der Fehler lag und welche Faktoren diesen beeinflussten.

Zusammenfassend lässt sich festhalten, dass das Projekt mit zeitlichen Herausforderungen konfrontiert war. Die frühzeitige Integration der API hätte dazu beitragen können, diese Hürden lösen zu können. Voraussetzung hierfür wäre gewesen eine API zu wählen, die zu unseren Anforderungen passt, sich in unser Problemszenario integrieren lässt. Dennoch wurden benötigte Funktionen erfolgreich mittels Rest Controller implementiert. Die Entitäten Movie, User und FavoriteMovie sind klar ersichtlich und wurden sinngemäß nach dem Problemszenario implementiert. Die hierfür notwendigen Annotationen wie: @GetMapping, @PostMapping, @PatchMapping und @DeleteMapping wurden berücksichtigt. Das GitHub-Wiki enthält die notwendigen Artefakte zur Dokumentation des Projektes wie z.B. das Domänenmodell, die REST-Tabelle, etc. Die REST-Tabelle liefert einen Überblick der Abfragen zu den Ressourcen und alle Änderungen im Projektverlauf wurden stets im Domänenmodell aktualisiert und dokumentiert. 


