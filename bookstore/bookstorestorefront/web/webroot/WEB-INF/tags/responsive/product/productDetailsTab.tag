<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="product" required="true" type="de.hybris.platform.commercefacades.product.data.ProductData"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>

<div class="tab-details">
	<ycommerce:testId code="productDetails_content_label">
		<p>
			Description : ${ycommerce:sanitizeHTML(product.description)}
			<br/>Rentable : ${ycommerce:sanitizeHTML(product.rentable)}
			<br/>Reward Points : ${ycommerce:sanitizeHTML(product.rewardPoints)}
		<p>

		</ycommerce:testId>
</div>