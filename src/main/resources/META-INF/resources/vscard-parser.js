var vCard = require('vcard-parser');
module.exports = {
    parse: vCard.parse,
    generate: vCard.generate
};