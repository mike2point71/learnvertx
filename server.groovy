def logger = container.logger
vertx.createHttpServer().requestHandler { req ->

    logger.info "I am logging ${req.uri}"

    if(["/", "/index", "/home", "/index.html"].contains(req.uri)){
        req.response.sendFile "index.html"
    }else {
        def pathChunks = req.path.tokenize("/")
        if(pathChunks.count{it}>1){

        } else {
            logger.info "Only 1 pathChunk"
        }
    }

}.listen(8080)
