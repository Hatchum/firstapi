package fr.api.firstapi.utils;

/**
 * Classe utilitaire définissant les différentes response HTTP
 * que l'on peut rencontrer avec leurs descriptions.
 */
@SuppressWarnings("unused")
public class UtilsResponsesHttp {
    /**
     * Constructeur private car classe utilitaire
     */
    private UtilsResponsesHttp() {}

    public enum ResponseHttp {
        /*
            Réponses Informatives
         */
        RESPONSE_101(101, "Continue", "Indique que tout est OK."),
        RESPONSE_102(102, "Switching Protocol", "Indique le protocole sur lequel passe le serveur"),
        RESPONSE_103(103, "Processing", "Indique que le serveur a reçu et traite la requête, mais aucune réponse disponible pour le moment"),
        /*
            Réponses de Succès
         */
        RESPONSE_200(200,"OK", "La requête a réussi. Le signification du succès peut varier selon la méthode HTTP :\n" +
                "GET : La ressource a été récupérée et est retransmise dans le corps du message.\n" +
                "HEAD : Les en-têtes d'entité sont dans le corps du message.\n" +
                "POST : La ressource décrivant le résultat de l'action est transmise dans le corps du message.\n" +
                "TRACE : Le corps du message contient le message de requête tel que reçu par le serveur"),
        RESPONSE_201(201,"Created", "La requête a réussi et la nouvelle ressource a été créée. Réponse envoyée après une requête PUT."),
        RESPONSE_202(202,"Accepted", "La requête a été reçue mais n'a pas encore été traitée.\n" +
                "Il n'y a aucun moyen en HTTP d'envoyer une réponse asynchrone ultérieure indiquant le résultat issu du traitement de la requête.\n" +
                "Elle est destinée aux cas où un autre processus ou serveur gère la requête, et peut être utile pour faire du traitement par lots."),
        RESPONSE_203(203,"Non-Authoritative Information", "l'ensemble de méta-informations renvoyé n'est pas exactement l'ensemble disponible sur le serveur d'origine,\n" +
                " mais plutôt un ensemble collecté à partir d'une copie locale ou tierce.\n" +
                "À l'exception de cette condition, une réponse 200 OK est préférable."),
        RESPONSE_204(204,"No Content", "Il n'y a pas de contenu à envoyer pour cette requête, mais les en-têtes peuvent être utiles."),
        RESPONSE_205(205,"Reset Content", "Ce code de réponse est envoyé après avoir traité une requête indiquant à l'agent utilisateur qu'il peut réinitialiser la vue du document qui a envoyé la requête."),
        RESPONSE_206(206,"Partial Content", "Ce code de réponse est utilisé en réaction à l'en-tête Range envoyé par le client pour séparer le téléchargement en plusieurs flux."),
        RESPONSE_207(207,"Multi-Status", "Une réponse multi-statut donne des informations sur des ressources multiples dans les situations où les codes de statut multiples sont appropriés."),
        RESPONSE_208(208,"Multi-Status", "Utilisé au sein d'un DAV : élément de réponse propstat pour éviter d'énumérer à maintes reprises les membres internes de bindings multiples vers la même collection."),
        RESPONSE_226(226,"IM Used", "Le serveur a exécuté une requête GET pour la ressource, et la réponse est une représentation du résultat d'une ou plusieurs manipulations d'instance appliquées à l'instance courante."),
        /*
            Messages de Redirection
         */
        RESPONSE_300(300,"Multiple Choice", "La requête a plusieurs réponses possibles.\n" +
                "L'agent utilisateur ou l'utilisateur doit choisir l'une d'entre elles."),
        RESPONSE_301(301,"Moved Permanently", "Ce code de réponse signifie que l'URI de la ressource demandée a été modifiée.\n" +
                "Ce code de réponse signifie que l'URI de la ressource demandée a été modifiée."),
        RESPONSE_302(302,"Found", "Ce code de réponse indique que l'URI de la ressource demandée a été modifiée temporairement. De nouveaux changements dans l'URI pourront être effectués ultérieurement.\n" +
                "Par conséquent, cette même URI devrait être utilisée par le client pour les requêtes futures."),
        RESPONSE_303(303,"See Other", "Le serveur a envoyé cette réponse pour diriger le client vers la ressource demandée via une autre URI en utilisant une requête GET."),
        RESPONSE_304(304,"Not Modified", "Ce code est utilisé pour des raisons de cache.\n" +
                "Il indique au client que la réponse n'a pas été modifiée. De fait, le client peut continuer à utiliser la même version de la réponse, mise en cache."),
        RESPONSE_307(307,"Temporary Redirect", "Le serveur a envoyé cette réponse pour rediriger le client afin d'obtenir la ressource demandée via une autre URI, en utilisant la même méthode que précédemment.\n" +
                " Ce code a la même sémantique que le code 302 Found, à l'exception près que l'agent utilisateur ne doit pas changer la méthode HTTP utilisée : \n" +
                "si POST était utilisé dans la première requête, alors POST doit être utilisé dans la seconde."),
        RESPONSE_308(308,"Permanent Redirect", "Cela signifie que la ressource a été déplacée de manière permante vers une autre URI, spécifiée dans l'en-tête de réponse HTTP Location:.\n" +
                " Ce code a la même sémantique que le code 301 Moved Permanently, à l'exception près que l'agent utilisateur ne doit pas changer la méthode HTTP utilisée : \n" +
                "si POST était utilisé dans la première requête, alors POST doit être utilisé dans la seconde."),
        /*
            Réponses d'Erreur côté Client
         */
        RESPONSE_400(400,"Bad Request", "Cette réponse indique que le serveur n'a pas pu comprendre la requête à cause d'une syntaxe invalide."),
        RESPONSE_401(401,"Unauthorized", "Une identification est nécessaire pour obtenir la réponse demandée.\n" +
                "Ceci est similaire au code 403, mais dans ce cas, l'identification est possible."),
        RESPONSE_402(402,"Payment Required", "Ce code de réponse est réservé à une utilisation future. Le but initial justifiant la création de ce code était l'utilisation de systèmes de paiement numérique."),
        RESPONSE_403(403,"Forbidden", "Le client n'a pas les droits d'accès au contenu, donc le serveur refuse de donner la véritable réponse."),
        RESPONSE_404(404,"Not Found", "Le serveur n'a pas trouvé la ressource demandée."),
        RESPONSE_405(405,"Method Not Allowed", "La méthode de requête est connue du serveur mais a été désactivée et ne peut pas être utilisée.\n" +
                "Les deux méthodes obligatoires, GET et HEAD, ne doivent jamais être désactivées et ne doivent pas retourner ce code d'erreur."),
        RESPONSE_406(406,"Not Acceptable", "Cette réponse est envoyée quand le serveur web, après une négotiation de contenu géré par le serveur, ne trouve rien qui satisfasse les critères donnés par l'agent utilisateur."),
        RESPONSE_407(407,"Proxy Authentication Required", "Similaire au code 401, sauf que l'identification doit être faite par un proxy."),
        RESPONSE_408(408,"Request Timeout", "Cette réponse est envoyée via une connexion en attente par certains serveurs, même sans qu'il y ait de requête préalable de la part du client."),
        RESPONSE_409(409,"Conflict", "Cette réponse est envoyée quand une requête entre en conflit avec l'état actuel du serveur."),
        RESPONSE_410(410,"Gone", "Cette réponse est envoyée quand le contenu demandé est supprimé du serveur."),
        RESPONSE_411(411,"Length Required", "Le serveur a rejeté la requête car le champ d'en-tête Content-Length n'est pas défini et le serveur l'impose."),
        RESPONSE_412(412,"Precondition Failed", "Le client a indiqué des préconditions dans ses en-têtes que le serveur ne remplit pas."),
        RESPONSE_413(413,"Payload Too Large", "L'entité demandée est plus grosse que la limite définie par le serveur;\n" +
                "le serveur peut fermer la connexion ou retourner un champ d'en-tête Retry-After."),
        RESPONSE_414(414,"URI Too Long", "L'URI interrogé par le client est plus long que ce que le serveur est en mesure d'interpréter."),
        RESPONSE_415(415,"Unsupported Media Type", "Le format média des données demandées n'est pas supporté par le serveur."),
        RESPONSE_416(416,"Requested Range Not Satisfiable", "La plage spécifiée par le champ d'en-tête Range de la requête ne peut pas être satisfaite ;\n" +
                " il est possible que la plage excède la taille des données provenant de l'URI ciblé."),
        RESPONSE_417(417,"Expectation Failed", "Ce code de réponse signifie que les attentes indiquées par le champ d'en-tête de requête Expect n'ont pas pu être satisfaites par le serveur."),
        RESPONSE_418(418,"I'm a teapot", "Le serveur refuse de brasser du café avec une théière."),
        RESPONSE_421(421,"Misdirected Request", "La requête a été envoyée à un serveur incapable de produire une réponse.\n" +
                "Ce code peut être envoyé par un serveur qui n'a pas été configuré pour produire des réponses sujettes à la combinaison de schémas et d'identités incluse dans l'URI de la requête."),
        RESPONSE_422(422,"Unprocessable Entity", "La requête a bien été constituée mais n'a pas pu être traitée à cause d'erreurs sémantiques."),
        RESPONSE_423(423,"Locked", "La ressource qui est en train d'être consultée est verrouillée."),
        RESPONSE_424(424,"Failed Dependency", "La requête a échoué à cause de l'échec d'une requête précédente."),
        RESPONSE_426(426,"Upgrade Required", "Le serveur refuse de traiter la requête en utilisant le protocole actuel mais peut accepter de le faire si le client opte pour un autre protocole.\n" +
                "Le serveur doit envoyer un champ Upgrade dans l'en-tête de la réponse 426 pour indiquer le(s) protocole(s) demandé(s)"),
        RESPONSE_428(428,"Precondition Required", "Le serveur d'origine impose que la requête soit conditionnelle.\n" +
                "Ceci est prévu pour empêcher le problème de 'perte de mise à jour', où un client\n" +
                "récupère l'état d'une ressource avec GET,\n" +
                "le modifie, et le renvoie au serveur avec PUT pendant qu'un tiers modifie l'état du serveur, ce qui conduit à un conflit."),
        RESPONSE_429(429,"Too Many Requests", "L'utilisateur a émis trop de requêtes dans un laps temps donné."),
        RESPONSE_431(431,"Request Header Fields Too Large", "Le serveur n'est pas disposé à traiter la requête car les champs d'en-tête sont trop longs.\n" +
                "La requête PEUT être renvoyée après avoir réduit la taille des en-têtes."),
        RESPONSE_451(451,"Unavailable For Legal Reasons", "L'utilisateur tente d'accéder à une ressource illégale, telle qu'une page censurée par un gouvernement."),
        /*
            Réponses d'Erreur côté Serveur
         */
        RESPONSE_500(500,"Internal Server Error", "Le serveur a rencontré une situation qu'il ne sait pas traiter."),
        RESPONSE_501(501,"Not Implemented", "La méthode de requête n'est pas supportée par le serveur et ne peut pas être traitée. \n" +
                "Les seules méthodes que les serveurs sont tenus de supporter (et donc pour lesquelles ils ne peuvent pas renvoyer ce code) sont GET et HEAD."),
        RESPONSE_502(502,"Bad Gateway", "Cette réponse d'erreur signifie que le serveur, alors qu'il fonctionnait en tant que passerelle pour recevoir une reponse nécessaire pour traiter la requête, a reçu une réponse invalide."),
        RESPONSE_503(503,"Service Unavailable", "Le serveur n'est pas prêt pour traiter la requête.\n" +
                "Les causes les plus communes sont que le serveur est éteint pour maintenance ou qu'il est surchargé.\n" +
                "Notez qu'avec cette réponse, une page ergonomique peut expliquer le problème.\n" +
                "Ces réponses doivent être utilisées temporairement et le champ d'en-tête Retry-After doit, dans la mesure du possible, contenir une estimation de l'heure de reprise du service.\n" +
                "Le webmestre doit aussi faire attention aux en-têtes de mise en cache qui sont envoyés avec cette réponse (qui ne doivent typiquement pas être mis en cache)."),
        RESPONSE_504(504,"Gateway Timeout", "Cette réponse d'erreur est renvoyée lorsque le serveur sert de passerelle et ne peut pas donner de réponse dans les temps."),
        RESPONSE_505(505,"HTTP Version Not Supported", "La version de HTTP utilisée dans la requête n'est pas supportée par le serveur."),
        RESPONSE_506(506,"Variant Also Negotiates", "Le serveur a une erreur de configuration interne : la négociation de contenu transparente pour la requête aboutit à une dépendance circulaire."),
        RESPONSE_507(507,"Insufficient Storage", "Le serveur a une erreur de configuration interne : \n" +
                "la ressource sélectionnée est configurée pour participer elle-même à une négociation de contenu transparente, et n'est par conséquent pas un nœud terminal valable dans le processus de négociation."),
        RESPONSE_508(508,"Loop Detected", "Le serveur a détecté une boucle infinie en traitant la requête."),
        RESPONSE_510(510,"Not Extended", "Des extensions supplémentaires sont requises afin que le serveur puisse satisfaire la requête."),
        RESPONSE_511(511,"Network Authentication Required", "Le code de statut 511 indique que le client doit s'authentifier afin de pouvoir accéder au réseau.");

        private int code;
        private String name;
        private String description;

        /**
         * Constructeur de l'enumeration {@link ResponseHttp} prenant les 3 parametres.
         *
         * @param code code de la response HTTP
         * @param name nom de la response HTTP
         * @param description description de la response HTTP
         */
        ResponseHttp(int code, String name, String description) {
            this.code = code;
            this.name = name;
            this.description = description;
        }

        /*
                GETTERS & SETTERS
         */
        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
