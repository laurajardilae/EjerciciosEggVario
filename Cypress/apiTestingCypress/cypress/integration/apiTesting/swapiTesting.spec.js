/// <reference types="Cypress" />

context('API testing', () => {
    it('Test 1: checking skin color and films length', () => {
        cy.request({
            method: 'GET',
            url: 'https://swapi.dev/api/people/2',
        }).then((response) => {
            console.log(response);
            expect(response.status).to.eq(200);
            expect(response.body).to.have.property('skin_color', 'gold');
            expect(response.body.films).to.have.lengthOf(6);
        })
    })
    it.only('Test 2: Checking date format and each element including more than one element', () => {
        cy.request({
            method: 'GET',
            url: 'https://swapi.dev/api/people/2',
        }).then((response) => {
            expect(response.status).to.eq(200);
            return response.body.films[1];
        }).then((secondFilm) => {
            cy.request({
                method: 'GET',
                url: secondFilm,
            }).then((response) => {
                console.log(response);
                expect(response.status).to.eq(200);
                expect(response.body.release_date).to.eq("1980-05-17");

                expect(response.body.characters).to.have.length.greaterThan(1);
                expect(response.body.planets).to.have.length.greaterThan(1);
                expect(response.body.starships).to.have.length.greaterThan(1);
                expect(response.body.vehicles).to.have.length.greaterThan(1);
                expect(response.body.species).to.have.length.greaterThan(1);
            })
        })
    })

})