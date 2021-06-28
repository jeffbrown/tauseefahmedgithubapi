package tauseefahmedgithubapi


import org.springframework.beans.factory.annotation.Autowired

class BootStrap {

    @Autowired
    GitHubClient client

    def init = { servletContext ->
        def repos = client.listRepositoriesForOrginazation('micronaut-projects')
        for(def repo : repos) {
            log.info "Repo Name: ${repo.name}"
        }
    }
    def destroy = {
    }
}
